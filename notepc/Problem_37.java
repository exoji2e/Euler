package notepc;
import java.util.Scanner;
public class Problem_37 {
    public static boolean isNP(int N) {
        if (N == 2) {
            return true;
        }
        
        if (N%2 == 0 || N ==1) {
            return false;
        }
        
        for (int i = 3; i<=Math.sqrt(N); i+=2) { 
            if(N%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNTrun(int n) {
        String s = "" + n;
        int l = s.length();
        for(int i = 1; i<l; i++) {
            int x = Integer.parseInt(s.substring(i,l));
            int y = Integer.parseInt(s.substring(0,l-i));
            
            if(isNP(x) == false || isNP(y) == false) {
                return false;
            }
        }
        System.out.println(n);
        return true;
        
    }
    public static int[] primtalsArray(int N){
        int primtal [] = new int [N];
        primtal[1] = 2;
        primtal[2] = 3;
        int counter = 3;
        int a = 0;
        
        for (int k = 5; k<=N; k+=2) {
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
        primtal[0] = counter;
        return primtal;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int primtal[] = primtalsArray(n);
        int sum = 0;
        for (int j = 5; j<primtal[0]; j++) {
            if (isNTrun(primtal[j]) == true) {
                sum += primtal[j];
            }
        }
        System.out.println(sum);
        
        
        
    }
    
}