public class Problem_69 {
    public static int gcd(int Q1, int Q2) {
        int k = 1;
        int r1 = 1;
        while(k*Q2 < Q1) {
            k++;
            if(k*Q2 == Q1) {
                return Q2;
            }
            if(k*Q2 > Q1) {
                return gcd(Q2,r1);                
            }
            r1 = Q1 - k*Q2;
        }
        return 0;
    }
    public static int gcdNy(int m, int n) {
        
        for (int i = 2; i<=n; i++) {
            if(m%i == 0 && n%i == 0) {
                return i;
            }
        }
        return 1;
    }
    
    public static double phi(double n){
        double sum = 1;
        int n1 = (int)(n);
        for(int i = 2; i<n; i++) {
            if(gcdNy(n1,i) == 1) {
                sum++; 
        
            }
        }
        return sum;
    }
    
    public static void main(String args[]) {
        System.out.println(270270.0/phi(270270.0));

        double maxn = 1;
        double maxphin = 0;
        for(double n = 10; n<=1000000; n+=10) {
            double x = n/phi(n);
            if(x > maxphin) {
                maxphin = n/phi(n);
                maxn = n;
                System.out.println(n);
            }
            System.out.println(n + " " + maxn + " " + x);

        }
        

    }
}