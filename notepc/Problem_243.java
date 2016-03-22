public class Problem_243 {
    
    public static int[] pDn (int n) {
        int[] primedivs = new int[(int)(Math.log(n) + 100)];
        int step = 0;
        
        if(n%2 == 0) {
            primedivs[step++] = 2;
            while(n%2 == 0) {
                n/=2;
            }
        }
        for(int i = 3; i<=Math.sqrt(n); i+=2) {
            if(n%i == 0) {
                primedivs[step++] = i;
                while(n%i == 0) {
                    n/=i;
                }
            }
        }
        if(n!=1) {
            primedivs[step++] = n;
        }
        int[] primes = new int[step];
        for(int i = 0; i<step; i++) {
            primes[i] = primedivs[i];
        }
        
        return primes;
        
    }

    public static double phi(int n) {
        
        int primes[] = pDn(n);
        
        int product = n;
        
        for(int i = 0; i<primes.length; i++) {
            product /= primes[i];
            product *= primes[i]-1;
        }
        return product;
    }
    
    public static void main(String args[]) {
        double minimum = 15499.0/94744.0;
        
        for(double d = 510510; true; d+=510510) {
            double a = phi((int)(d))/(d-1);
            if(a < minimum) {
                System.out.println(d  + " YAAY");
                break;
            } else {
                System.out.println(d  + " fail " + a);

            }
        }
            
    }
    
    
    
    

}