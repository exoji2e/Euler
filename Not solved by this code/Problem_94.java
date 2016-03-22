import java.math.BigInteger;

public class Problem_94 {
    public static boolean isBigISQ(BigInteger z2, long c) {
        BigInteger x = BigInteger.valueOf(c);
        
        for(long i = 0; i>0; i--) {
            
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
        System.out.println(isBigISQ(BigInteger.valueOf(16),5));
        double sum = 0;
        
        double a;
        double b;
        double bas;
        double ab2;

        
        long Integertestb;
        long Integertestab;
        int x;
        long array [] = new long [1000000];
        int counter = 1;
        
        for(double c0l = 3; c0l*3<1000000002; c0l+=2) {
            bas = c0l+1;
            a = bas/2;
            
            
            b = Math.sqrt((c0l*c0l) - (a*a));
            Integertestb = (int)(b);
            b = b-Integertestb;
            ab2 = a*b;
            
            if(0 == b) {
                sum += bas + c0l + c0l;
                System.out.println(sum);
            }
                
            else if(ab2%1 == 0) {
                
                array[counter] = (long)(c0l);
                counter++;
                System.out.println(counter);
            }
            
            bas = c0l-1;
            a = bas/2;
            
            
            b = Math.sqrt((c0l*c0l) - (a*a));
            Integertestb = (int)(b);
            b = b-Integertestb;
            ab2 = a*b;
            
            if(0 == b) {
                sum += bas + c0l + c0l;
                System.out.println(sum);
            }
            
            else if(ab2%1 == 0) {
                
                array[counter] = (long)(c0l);
                counter++;
                System.out.println(counter);

            }
        }
        System.out.println((long)(sum));
        
        array[0] = counter;
        long summan = (long) (sum);
        System.out.println(summan);
        long c;
        BigInteger z00;
        BigInteger z01;
        BigInteger z0;
        BigInteger four = BigInteger.valueOf(4);
        long c31;
        long c30;
        long c10;
        long c11;
        for(int i = 1; i<array[0]; i++) {
            
            c = array[i];
            
            c31 = c*3 + 1;
            c30 = c*3 - 1;
            c11 = c + 1;
            c10 = c - 1;
            
            z00 = BigInteger.valueOf(c31);
            z01 = BigInteger.valueOf(c10);
            z0 = z00.multiply(z01).divide(four);
            
            
            if(isBigISQ(z0, c)==true) {
                summan+= 3*c + 1;
                System.out.println(summan + " " + i);
            } else {
                z00 = BigInteger.valueOf(c30);
                z01 = BigInteger.valueOf(c11);
                z0 = z00.multiply(z01).divide(four);
                
                if(isBigISQ(z0, c)==true) {
                    summan+= 3*c - 1;
                    System.out.println(summan + " " + i);
                    
                }
                
            }
            System.out.println(i);
            
            
        }
        System.out.println(sum);

        
        
        
        
        
                
    }
}