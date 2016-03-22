import java.math.BigInteger;
import java.util.Scanner;
public class Problem_120 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        long remainder = 0;
        
        BigInteger one = BigInteger.valueOf(1);
        
        
        long sum = 0;
        int savedn = 0;
        
        for(int a = 1000; a>=3; a--) {
            remainder = 0;
            for(int n = 1; n<=x; n++) {
                
                BigInteger Ba = BigInteger.valueOf(a);
                
                BigInteger square = Ba.pow(2);
                
                
                BigInteger Large = ((Ba.subtract(one)).pow(n)).add(Ba.add(one).pow(n));
                
                if(Large.mod(square).longValue() > remainder) {
                    remainder = Large.mod(square).longValue();
                    savedn = n;
                }
                
                
            }
            sum += remainder;
            System.out.println(sum + " " + remainder + " " + savedn + " " + a);
            
        }
        
        
    }
}