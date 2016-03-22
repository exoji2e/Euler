import java.util.Scanner;
import java.math.BigInteger;
public class Problem_203 {
    public static BigInteger[] primtalsSqArray(long N){
        int count = (int)(N);
        BigInteger primtal [] = new BigInteger[count];
        primtal[1] = BigInteger.valueOf(4);
        primtal[2] = BigInteger.valueOf(9);
        int counter = 3;
        int a = 0;
        
        for (long k = 5; k<=N; k+=2) {
            if (k%2 != 0) {
                a = 0;
                
                for (int i = 3; i<=Math.sqrt(k); i+=2) { 
                    if(k%i == 0) {
                        a++;
                        break;
                    }
                }
                if (a == 0) {
                    primtal [counter] = BigInteger.valueOf(k).multiply(BigInteger.valueOf(k));
                    counter++;
                }
            }
        }
        primtal[0] = BigInteger.valueOf(counter);
        return primtal;
    }
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        
        int numbs = rows*(rows+1)/2;
        
        BigInteger pascal[][] = new BigInteger[rows][rows];
        
        for(int fill = 0; fill<rows; fill++) {
            pascal[0][fill] = BigInteger.valueOf(1);
            pascal[fill][fill] = BigInteger.valueOf(1);

        }
        BigInteger unice [] = new BigInteger[numbs];
        unice[0] = pascal[0][0];
        int counterOfUnice = 0;

        int controll = 0;
        
        for(int row = 2; row<rows; row++) {
            for(int col = 1; col < row; col++) {
                pascal[col][row] = pascal[col-1][row-1].add(pascal[col][row-1]);
                controll = 0;
                for(int cc = 0; cc<=counterOfUnice; cc++) {
                    if(pascal[col][row].equals(unice[cc])) {
                        controll++;
                        break;
                    }
                }
                
                if(controll == 0) {
                    counterOfUnice++;
                    unice[counterOfUnice] = pascal[col][row];
                    System.out.println(unice[counterOfUnice]);
                }
                
            }
        }
        
        
        String s = "" + unice[counterOfUnice];
        
        s = s.substring(0,s.length()/2+1);
        
        long maxPrime = Long.parseLong(s.substring(0));
        
        BigInteger primeSq[] = primtalsSqArray(maxPrime);
        
        long sum = 1;
        
        int checkagain = 0;
        
        for(int stepunice = 1; stepunice<=counterOfUnice; stepunice++) {
            for(int stepPrime = 1; stepPrime<primeSq[0].longValue(); stepPrime++) {
                if(unice[stepunice].mod(primeSq[stepPrime]).equals(BigInteger.valueOf(0))) {
                    checkagain++;
                    break;
                }
                if(unice[stepunice].compareTo(primeSq[stepPrime]) == -1) {
                    break;
                }
            }
            if(checkagain == 0) {
                sum+=unice[stepunice].longValue();
                System.out.println(sum);

            }
            checkagain = 0;
        }
        
        System.out.println(sum + " " + counterOfUnice);
        

        
        
    }
}