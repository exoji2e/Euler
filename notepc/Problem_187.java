public class Problem_187 {
    public static boolean isNP(long N) {
        if(N == 1) {
            return false;
        }
        if (N == 2) {
            return true;
        }
        if (N%2 == 0) {
            return false;
        }
        for (int i = 3; i<=Math.sqrt(N); i+=2) { 
            if(N%i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]) {
        int count = 0;
        
        for(int n = 2; n<100000000; n++) {
            for(int k = 2; k<Math.sqrt(n)+2; k+=2) {
                if(k==4) {
                    k--;
                }
                if(n%k==0) {
                    if(isNP(n/k)) {
                        count++;
                        //System.out.println(count + " " + n);
                        /*if(count%10000 == 0) {
                            System.out.println(n);
                        }*/
                    }
                    break;
                }
            }
        }
        System.out.println(count);
        
        
    }
}