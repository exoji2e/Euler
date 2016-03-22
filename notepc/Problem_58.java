import java.util.Scanner;
public class Problem_58 {
    public static boolean isNPrime(int N) {
        if (N == 2) {
            return true;
        }
        if (N%2 == 0) {
            return false;
        }
        for (int i = 3; i<=Math.sqrt(N); i+=2) { 
            if(N%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        int dignumb = 4;
        int digprimes = 3;
        int slength = 3;
        
        int rightup = 3;
        int leftup = 5;
        int leftdown = 7;
        int rightdown = 9;

        
        while(dignumb/digprimes < 10) {
            slength+=2;

            rightup = rightdown + slength -1;
            leftup = rightup + slength -1;
            leftdown = leftup + slength -1;
            rightdown = leftdown + slength -1;
            
            if(isNPrime(rightup) == true) {
                digprimes++;
            }
            if(isNPrime(leftup) == true) {
                digprimes++;
            }
            if(isNPrime(leftdown) == true) {
                digprimes++;
            }
            if(isNPrime(rightdown) == true) {
                digprimes++;
            }
            
            dignumb+=4;
        }
        System.out.println(slength);
        
        
    }
}