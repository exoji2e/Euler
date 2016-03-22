//funkar inte, får med tal som är produkter av två primtal större än 100 flera ggr.. typ, 101*103*n
import java.util.Scanner;
public class Problem_204 {	
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int notHamming = 0;
        int a = 0;
        
     
        for (int k = 101; k<=N; k+=2) {
            a = 0;
            for (int i = 3; i<=Math.sqrt(k); i+=2) { 
 
                if(k%i == 0) {
                    a++;
                    break;
                }
            }
            if (a == 0) {
                notHamming+=(int)(N/k);
                System.out.println(notHamming + " " + k);
            }
        }
    }
}
