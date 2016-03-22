import java.util.Scanner;
import java.math.BigInteger;
public class Problem_123 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        long thebreaker = sc.nextLong();
        
        
        int n = 2;
        int k = 3;
        int breaker = 0;
        int a = 0;
        
        BigInteger left;
        BigInteger square;
        BigInteger kval;
        BigInteger one = BigInteger.valueOf(1);

        
        while(breaker==0) {
            
            a = 0;
            
            for (int i = 3; i<=Math.sqrt(k); i++) {
                if(k%i == 0) {
                    a++;
                    break;
                }
            }
            
            if(a == 0) {
                if(n%2 ==1) {
                    square = (BigInteger.valueOf(k)).pow(2);
                    
                    if(square.longValue() > thebreaker*5 || thebreaker < 100000000) {
                        
                        kval = BigInteger.valueOf(k);
                        
                        left = ((kval.subtract(one)).pow(n)).add((kval.add(one)).pow(n)).mod(square);
                    
                        if(n%100 ==1) {
                            System.out.println(left + " " + k);
                        }
                        if(left.longValue() >= thebreaker) {
                            breaker++;
                            break;
                        }
                    }
                }
                
                n++;
            }
            
                
                
            k+=2;
        }
        System.out.println(n);
        
        
    }
}