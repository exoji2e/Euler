import java.math.BigInteger;
public class Problem_231 {
    public static int[] primtalsArray(int N){
        int count = N/1000 + 2000000;
        int primtal [] = new int [count];
        primtal[1] = 2;
        primtal[2] = 3;
        int counter = 3;
        int a = 0;
        
        for (int k = 5; k<=N; k+=2) {
            if (k%2 != 0) {
                a = 0;
                
                for (int i = 3; i<=Math.sqrt(k); i+=2) { 
                    if(k%i == 0) {
                        a++;
                        break;
                    }
                }
                if (a == 0) {
                    primtal [counter] = k;
                    counter++;
                }
            }
        }
        primtal[0] = counter;
        return primtal;
    }
    
    public static int sig(int n, int i) {        
        int sum = 0;
        
        while(n>1) {
        
            
            sum+= n%i;
            
            n = (int)(n/i);
        
        
        }
        
        return sum;
        
    }
    
    public static void main(String args[]) {
        
       int primearray20[] = primtalsArray(20000000);
        System.out.println("klararr1");
        
       int primearray15[] = primtalsArray(15000000);
        System.out.println("klararr2");
        
        int primearray5[] = primtalsArray(5000000);
        System.out.println("klararr3");

        BigInteger sum = BigInteger.valueOf(2);
        
        
        int n20 = 20000000;
        int n15 = 15000000;
        int n5 = 5000000;
        
        for(int i = 1; i<primearray20[0]; i++) {
            sum = sum.add(BigInteger.valueOf(((n20-sig(n20,primearray20[i]))/(primearray20[i]-1))*primearray20[i]));
        
        }
            
            
        for(int i = 1; i<primearray15[0]; i++) {
            sum = sum.subtract(BigInteger.valueOf(((n15-sig(n15,primearray15[i]))/(primearray15[i]-1))*primearray15[i]));
        }
        for(int i = 1; i<primearray5[0]; i++) {
            sum = sum.subtract(BigInteger.valueOf(((n5-sig(n5,primearray5[i]))/(primearray5[i]-1))*primearray5[i]));
        }
        System.out.println(sum);
        
        /*for(int n = 20000000; n>15000000; n--) {
            sum += primeFacSum(n);
            System.out.println(sum + " " + n);

        }
        for(int n = 500000; n>1; n--) {
            sum += primeFacSum(n);
            System.out.println(sum + " " + n);

        }
        System.out.println(sum);
        
        */
    }
}