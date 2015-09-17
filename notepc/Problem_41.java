package notepc;
public class Problem_41 {
    public static boolean isNPrime(int N){
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

    public static int firstPrm(int N){
        String s = "" + N;
        if (s.length() > 1) {
            for(int i = 0; i<s.length()-1;i++) {
                if (Integer.parseInt(s.substring(i,i+1)) > Integer.parseInt(s.substring(i+1,i+2))) {
                    s = s.substring(0,i) + s.substring(i+1,i+2)+ s.substring(i,i+1) + s.substring(i+2,s.length());
                }
            }
            int ny = Integer.parseInt(s.substring(0,s.length()-1));
            s = ""+firstPrm(ny) + s.substring(s.length()-1,s.length());
        }
        int fP = Integer.parseInt(s.substring(0)); 
        return fP;
    }
    
    
    public static void main(String args[]) {
        
        int max = 0;
        for(int i = 7654321; i>=1234567; i--) {
            if(firstPrm(i) == 1234567 && isNPrime(i) == true) {
                max = i;
                System.out.println(max);
                break;
            }
        }
        
    }
}