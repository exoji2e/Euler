public class Problem_144 {
    
    public static double xval(double a, double b, double k, boolean tmp) {
        
        if(tmp) {
            return (2*Math.sqrt(-2*a*b*k - a*a*k*k - b*b + 25*k*k + 100) + a*k*k + b*k)/(k*k + 4);
        } else {
            return (a*k*k - 2*Math.sqrt(-2*a*b*k - a*a*k*k - b*b + 25*k*k + 100) + b*k)/(k*k + 4);
        }
    }
        
    public static boolean check(double x, double y) {
        if(x<=0.01 && x>=-0.01 && y>0) {
            return false;
        }
        return true;
    }
    
    public static void main(String args[]) {
        
        
        int count = 1;
        double lastx = 0.0;
        double lasty = 10.1;
        double x = 1.4;
        double y = -9.6;
        double k1 = (y-lasty)/(x-lastx);
        double ks;
        double k2 = (y-lasty)/(x-lastx);
        double vk1;
        double vk2;
        double vks;
        double tmpx;
        double tmpx2;
        int checked = 0;
        
        while(check(x,y)) {
            
            ks = -4*x/y;

            vk1 = Math.atan(k2);
            vks = Math.atan(ks);
            
            /*if(vk1 < 0) {
                vk1 += Math.PI;
                System.out.println("+vk1");
            }
            if(vks < 0) {
                vks += Math.PI;
                System.out.println("+vks");

            }*/
            
            vk2 = 2*vks - Math.PI - vk1;
            
            k1 = k2;
            k2 = Math.tan(vk2);
                
            //System.out.println(k1 + " " + vks + " " + mv);

            tmpx = xval(x, y, k1, true);
            tmpx2 = xval(x, y, k1, false);
            //System.out.println(x + " " + " " + tmpx + " " + tmpx2);

                
            if((long)(1000000000*x) == (long)(1000000000*tmpx)) {
                x = tmpx2;
            } else {
                x = tmpx;
            }
                
            y = Math.sqrt(100 - 4*x*x);
            
            System.out.println(x + " " + y + " " + count + " " + ks + " " + k1 + " " + k2);
            count++;

        }
        
        System.out.println(Math.atan(2.3) + " " + Math.atan(2.3+Math.PI) + " " +Math.tan(2.3) + " " + Math.tan(2.3+Math.PI));
            
            
            
            
            
            
        
    }
}