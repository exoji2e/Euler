clf;
a = 4;
b = 3;
x = @(t) b*cos(t);
y = @(t) a*sin(t);
dx = @(t) -b*sin(t);
dy = @(t) a*cos(t);

d = @(t) integral(@(z)sqrt(dx(z).^2 + dy(z).^2),3*pi/2,t+pi/2);
dp = @(t) sqrt(dx(t+pi/2).^2 + dy(t+pi/2).^2);

ph = @(t) pi/2 - t;
php = @(t) -1;

%tt = @(t) fminbnd(@(x)a*cos(x).*sin(ph(t)) + b*sin(x).*cos(ph(t)),pi,3*pi);%
tt1 = @(t) atan(-a./(tan(t)*b))+3*pi/2;
tt1p = @(t) a*b./(a*a*cos(t).^2 + b*b*sin(t).^2);


cx = @(t,s) d(s) - a*cos(s).*cos(ph(t)) + b*sin(s).*sin(ph(t));
cxp = @(t) a*cos(ph(t)).*tt1p(t).*sin(tt1(t)) - a*sin(ph(t)).*cos(tt1(t)) + b*sin(ph(t)).*tt1p(t).*cos(tt1(t)) - b*cos(ph(t)).*sin(tt1(t)) + tt1p(t).*dp(tt1(t));
%cx = @(t) - a*cos(tt(t)).*cos(ph(t)) + b*sin(tt(t)).*sin(ph(t));
%cx = @(t) d(t);
cy = @(t,s) -a*cos(s).*sin(ph(t)) - b*sin(s).*cos(ph(t));
cyp = @(t) a*sin(ph(t)).*tt1p(t).*sin(tt1(t)) + a*cos(ph(t)).*cos(tt1(t)) - b*cos(ph(t)).*tt1p(t).*cos(tt1(t)) - b*sin(ph(t)).*sin(tt1(t));

4*integral(@(t) sqrt(cxp(t).^2 + cyp(t).^2),0,pi/2)
th = 0:pi/100:pi-0.0000001;
ccx = [];
ccy = [];
k = 0;
for i = th
    s = tt1(i);
    ccx = [ccx cx(i,s)];
    ccy = [ccy cy(i,s)];
    k = k+1;
end


plot(ccx,ccy);
axis([0 30 0 8])
k = 1;
sum = 0;
while(k<100)
    h = hypot(ccx(k)-ccx(k+1),ccy(k)-ccy(k+1));%better?
    if(h<1)
        sum = sum +h;
    end
    k = k+1;
end
2*sum
%clf;
%plot(th,ccx,'r');
%hold on;
%plot(th,ccy,'b');


%dcx = @(t) sqrt(dx(t+3*pi/2).^2 + dy(t+3*pi/2).^2) + a*sin(tt(t)).*cos(ph(t)) - a*cos(tt(t)).*sin(ph(t)) + b*cos(tt(t)).*sin(ph(t)) - b*sin(tt(t)).*cos(ph(t));
%dcy = @(t) a*sin(tt(t)).*sin(ph(t)) + a*cos(tt(t)).*cos(ph(t)) - b*cos(tt(t)).*cos(ph(t)) - b*sin(tt(t)).*sin(ph(t));
%integral(@(z) sqrt(dcx(z).^2 + dcy(z).^2),0,2*pi)
%clf;
%a = 4;
%b = 2;
%x = @(t) b*cos(t);
%y = @(t) a*sin(t);
%dx = @(t) -b*sin(t);
%dy = @(t) a*cos(t);

%d1 = @(t) integral(@(z)sqrt(dx(z).^2 + dy(z).^2),-pi,t);
%d = @(t) integral(@(z)sqrt(dx(z).^2 + dy(z).^2),-pi,t);

%ph = @(t) pi/2 - t;

%tt = @(t) fminbnd(@(x)a*cos(x).*sin(ph(t)) + b*sin(x).*cos(ph(t)),-pi,pi);%
%tt1 = @(t) atan(-a/(tan(t)*b));


%cx = @(t,s) d1(s) - a*cos(s).*cos(ph(t)) + b*sin(s).*sin(ph(t));
%cx = @(t) - a*cos(tt(t)).*cos(ph(t)) + b*sin(tt(t)).*sin(ph(t));
%cx = @(t) d(t);
%cy = @(t,s) -a*cos(s).*sin(ph(t)) - b*sin(s).*cos(ph(t));

%th = 0:pi/1000:pi-0.0000001;
%ccx = [];
%ccy = [];
%k = 0;
%for i = th
%    s1 = tt1(i)-pi/2;
%    ccx = [ccx cx(i,s1)];
%    ccy = [ccy cy(i,s1)];
%    k = k+1;
%end


%plot(ccx,ccy);
%axis([0 30 0 8])
%k = 1;
%sum = 0;
%while(k<1000)
%    h = hypot(ccx(k)-ccx(k+1),ccy(k)-ccy(k+1));%better?
%    if(h<1)
%        sum = sum +h;
%    end
%    k = k+1;
%end
%sum*2



%dcx = @(t) sqrt(dx(t+3*pi/2).^2 + dy(t+3*pi/2).^2) + a*sin(tt(t)).*cos(ph(t)) - a*cos(tt(t)).*sin(ph(t)) + b*cos(tt(t)).*sin(ph(t)) - b*sin(tt(t)).*cos(ph(t));
%dcy = @(t) a*sin(tt(t)).*sin(ph(t)) + a*cos(tt(t)).*cos(ph(t)) - b*cos(tt(t)).*cos(ph(t)) - b*sin(tt(t)).*sin(ph(t));
%integral(@(z) sqrt(dcx(z).^2 + dcy(z).^2),0,2*pi)
