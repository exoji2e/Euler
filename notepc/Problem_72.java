public class Problem_72 {
    public static double toitent(double n) {
        double savedp = 0;
        double ret = n;

        while (true) {
            if(n%2 == 0) {
                if(savedp != 2) {
                    ret = ret - (ret/2);
                    savedp = 2;
                }
                n = n/2;
            }else {
                break;
            }
        }
        for(double k = 3; k<=Math.sqrt(n); k+=2) {
        
            if(n%k == 0) {
                if(savedp != k) {
                    ret = ret - ret/k;
                    savedp = k;
                }
                n = n/k;
                k-=2;
            }
        }
        
        if(n!=savedp && n!=1) {
            ret = ret - ret/n;
        }
        
        return ret;
    }
    public static void main(String args[]) {
        
        long sum = -1;
        
        for (long d = 1; d<=1000000; d++) {
            sum+=toitent(d);
            System.out.println(d + " " + sum);
        }
        
    }
}





