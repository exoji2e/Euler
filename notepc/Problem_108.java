import java.math.BigInteger;
public class Problem_108 {
    public static void main(String args[]) {
        int solutions = 0;
        int n = 37000;
        BigInteger zero = BigInteger.valueOf(0);
        int maxsol = 0;
        int maxn = 0;
        while(solutions<=1000) {
            if(solutions > maxsol) {
                maxsol = solutions;
                maxn = n;
            }
            n+=10;

            solutions = 1;
            for(int x = n+2; x<2*n+1; x++) {
                BigInteger a = BigInteger.valueOf(x-n);
                BigInteger xn = BigInteger.valueOf(x).multiply(BigInteger.valueOf(n));
                if(xn.mod(a).intValue() == 0) {
                    solutions++;
                }
            }
            System.out.println(n + " " + solutions + " " + maxsol + " " + maxn);

        }
        
        System.out.println(n + " " + solutions);
    }
}