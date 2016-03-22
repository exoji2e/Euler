import java.math.BigInteger;
import java.util.Scanner;
public class Problem_131 {
    
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int countcrazyprimes = 0;
        
        int prime[] = new int [N];
        
        prime[1] = 2;
        prime[2] = 3;
        int countprime = 3;

        int check;
        for(int k = 5; k<=N; k+=2) {
            check = 0;
            for(int i = 3; i<=Math.sqrt(k); i+=2) {
                if(k%i == 0) {
                    check++;
                    break;
                }
            }
            if(check == 0) {
                prime[countprime] = k;
                countprime++;
                
            }
        }
        prime[0] = countprime;
        
        
        
        for(int i = 1; i<prime[0]; i++) {
            for(int n = 1; 3*n*n + 3*n + 1 <= prime[i]; n++) {
                if(3*n*n + 3*n + 1 == prime[i]) {
                    if(Math.pow((Math.pow(n,9) + Math.pow(n,6)*prime[i]),1/3)%1 == 0) {
                            countcrazyprimes++;
                            System.out.println(n + " " + countcrazyprimes);
                        }
                }
            }
        }
    }
}