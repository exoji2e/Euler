import java.math.BigInteger;
public class Problem_56 {
    public static void main(String args[]) {
        
        int digsum = 0;
        int digsum1;
        
        for(int a = 50; a<100; a++) {
            for(int b = 50; b<100; b++) {
                BigInteger test = BigInteger.valueOf(a);
                test = test.pow(b);
                
                String s = "" +test;
                digsum1 = 0;
                for(int i = 0; i<s.length(); i++) {
                    digsum1+=Integer.parseInt(s.substring(i,i+1));
                }
                
                if(digsum1 > digsum) {
                    digsum = digsum1;
                }
            }
        }
        System.out.println(digsum);
    }
}