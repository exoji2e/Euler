import java.math.BigInteger;
public class Problem_94_herons {
    public static boolean isBigISQ(BigInteger z2, long c) {
        BigInteger x = BigInteger.valueOf(c);

        for(long i = c; i>0; i--) {
            
            x = BigInteger.valueOf(i);
            
            x =x.multiply(x);
            
            if(x.equals(z2)) {
                return true;
            }
            
            if(x.compareTo(z2) < 1) {
                return false;
            }
            
        }
        return false;
    }
    public static void main(String args[]) {
        BigInteger z00;
        BigInteger z01;
        BigInteger z0;
        BigInteger x;
        BigInteger four = BigInteger.valueOf(4);
        long c31;
        long c30;
        long c10;
        long c11;

        
        long sum = 0;
        
        
        for(long c = 5; c*3<1000000000; c+=2) {
            c31 = c*3 + 1;
            c30 = c*3 - 1;
            c11 = c + 1;
            c10 = c - 1;
            
            z00 = BigInteger.valueOf(c31);
            z01 = BigInteger.valueOf(c10);
            z0 = z00.multiply(z01).divide(four);
            x = BigInteger.valueOf(c);

            
            if(isBigISQ(z0, c)) {
                sum+= 3*c + 1;
                System.out.println(sum);
            } else {
                z00 = BigInteger.valueOf(c30);
                z01 = BigInteger.valueOf(c11);
                z0 = z00.multiply(z01).divide(four);

                if(isBigISQ(z0, c)) {
                    sum+= 3*c - 1;
                    System.out.println(sum);

                }
                
            }
            System.out.println(c);

            
        }
        System.out.println(sum);

    }
}