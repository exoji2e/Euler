import java.math.BigInteger;
import java.util.Scanner;
public class Problem_188 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int e = sc.nextInt();
        
        BigInteger number = BigInteger.valueOf(n);
        BigInteger staticnumb = BigInteger.valueOf(n);

        
        BigInteger ten8 = new BigInteger("1000000000000");
        
        
        
        for(int i = 1; i<e; i++) {
            number = staticnumb.modPow(number,ten8);
            System.out.println(i + " " + number);
        }
        System.out.println(number);
        
        
    }
}