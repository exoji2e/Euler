import java.util.Scanner;
import java.math.BigInteger;

public class Problem_383 {
    /*public static BigInteger f5facBI(BigInteger i) {
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger five = BigInteger.valueOf(5);

        while(i.compareTo(five) != -1) {
            i = i.divide(five);
            sum = sum.add(i);
            System.out.println(i);
        }
        return sum;
    }*/
    
    public static int f5fac(int i) {
        int sum = 0;
        while(i>=5) {
            i = (int) (i/5);
            sum+=i;
        }
        return sum;
    }
    
    public static int f5fac5(int i) {
        int sum = 0;
        while(i%5 == 0) {
            i = (int) (i/5);
        }
        return i;
    }
    
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        //int arren[] = new int [1 + N/5];
        
        int c = 0;
        int c2 = 0;
        int savei = 0;
        for(int i = 5; i<=N; i+=5) {
            
            /*if(arren[f5fac5(i)] == 1) {
                c++;
                //System.out.println(c + " " + i);

            } else */if(2*f5fac(i) > f5fac(2*i-1)) {
                //arren[f5fac5(i)] = 1;
                c++;
                /*if((i/5)%5 != 0 && i > savei + 100000) {
                    savei = i;
                    c2++;
                    System.out.println(c2 + " " + i);

                }*/
                
            }            
        }
        System.out.println(c);
        
        /*
        int test = sc.nextInt();
        BigInteger two = BigInteger.valueOf(2);
        BigInteger one = BigInteger.valueOf(1);

        BigInteger i1 = BigInteger.valueOf(10);
        
        i1 = i1.pow(test);

        BigInteger i2 = i1.multiply(two);
        
        i2 = i2.subtract(one);

        
        System.out.println(two.multiply(f5facBI(i1)) + " " + f5facBI(i2));
        */
        
        
    }
}