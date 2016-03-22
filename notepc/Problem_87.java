import java.util.Scanner;
public class Problem_87 {
    public static int[] primtalsArray(int N){
        int count = N/1000 + 20000;
        int primtal [] = new int [count];
        primtal[0] = 2;
        primtal[1] = 3;
        int counter = 2;
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
        primtal[counter] = N+1;
        
        return primtal;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int sqN = (int)(Math.sqrt(N) + 1);
        
        int primes [] = primtalsArray(sqN);
        
        int specnumb [] = new int [N];
        
        
        int sq = 0;
        int cub = 0;
        int sqsq = 0;
        
        int counter = 0;
        
        while(primes[sqsq]*primes[sqsq]*primes[sqsq]*primes[sqsq] < N) {
            cub = 0;
            while(primes[sqsq]*primes[sqsq]*primes[sqsq]*primes[sqsq] + primes[cub]*primes[cub]*primes[cub] < N) {
                sq = 0;
                while(primes[sqsq]*primes[sqsq]*primes[sqsq]*primes[sqsq] + primes[cub]*primes[cub]*primes[cub] + primes[sq]*primes[sq] < N) {
                    if(specnumb [primes[sqsq]*primes[sqsq]*primes[sqsq]*primes[sqsq] + primes[cub]*primes[cub]*primes[cub] + primes[sq]*primes[sq]] == 0) {
                        counter++;
                        specnumb [primes[sqsq]*primes[sqsq]*primes[sqsq]*primes[sqsq] + primes[cub]*primes[cub]*primes[cub] + primes[sq]*primes[sq]] = 1;
                        

                    }
                    sq++;
                    
                }
                cub++;
            }
            sqsq++;
        }
        System.out.println(counter);

        
        
        
    }
}