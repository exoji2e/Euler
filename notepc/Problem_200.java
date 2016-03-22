import java.util.Arrays;
import java.math.BigInteger;
public class Problem_200 {
   /* public static boolean surIPrm(Long L) {
        if (L%2 == 0) {
            for 
        }
    }
    */
    public static boolean contains200(String s){
        for (int a = 0; a<s.length()-2; a++) {
            if (Integer.parseInt(s.substring(a,a+3)) == 200) {
                return true;
            }
        }
        
        return false;
    }
    
    
    
    public static int[] primtalsArray(int N){
        
        int primtal [] = new int [N];
        primtal[0] = 2;
        primtal[1] = 3;
        int counter = 2;
        int a = 0;
        
        for (int k = 5; k<=N*N; k+=2) {
            if (counter == N) {
                break;
            }
            if (k%2 != 0) {
                a = 0;
                
                for (int i = 3; i<=Math.sqrt(k); i+=2) { 
                    if(k%i == 0) {
                        a++;
                        break;
                    }
                }
                if (a == 0) {
                    primtal [counter] = k;
                    counter++;
                }
            }
        }
        return primtal;
    }

    
    public static void main(String args[]) {
        int n = 500;
        int primtal[] = primtalsArray(n);
        
        Long twooo[] = new Long [10000];
        
        Long ootwo;
        int tmp = 0;
        String s;
        for(long p = 0; p<n; p++) {
            for(long q = 0; q<n/5; q++) {
                if (q!=p) {
                    
                    
                    ootwo = (Long) (p*p*q*q*q);
                    
                    s = "" + ootwo;
                    
                    
                    if (contains200(s) == true) {
                        
                        twooo[tmp] = ootwo;
                        System.out.println(twooo[tmp] + " " + tmp + " "+ p + " " +q);

                        tmp++;
                    }
                }
            }
        }
        
        Arrays.sort(twooo);
        
        
    }
}