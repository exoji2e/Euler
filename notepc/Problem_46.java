package notepc;
import java.util.Scanner;
public class Problem_46 {
    public static boolean isNP(int N) {
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        int sq;
        for (int a = 3; a<n; a+=2) {
            if(isNP(a) == false) {
                for(int rsq = 2; 2*rsq*rsq<a; rsq++) {
                    sq = 2*rsq*rsq;
                    if(isNP(a-sq) == true) {
                        x = 0;
                        break;
                    }
                }
                if (x == 1) {
                    System.out.println(a);
                }
                x = 1;
            }
        }
    }
}