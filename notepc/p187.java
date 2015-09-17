package notepc;
import java.util.ArrayList;


public class p187 {
	public static void main(String args[]) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		for(int i = 3; i<50000000; i+=2) {
			boolean survived = true;
			int j = 0;
			int nxtprime = primes.get(j);
			while(nxtprime*nxtprime<=i) {
				if (i%nxtprime == 0) {
					survived = false;
					break;
				} else if(j + 1 == primes.size()) {
					break;
				} else {
					j++;
					nxtprime = primes.get(j);
				}
			}
			if(survived) {
				primes.add(i);
			}
		}
		int i = 0;
		long max = 100000000;
		int solutions = 0;
		for(int j = primes.size()-1; j>=0;j--) {
			i = 0;
			while(primes.get(i)*primes.get(j) < max && i<=j) {
				i++;
			}
			solutions += i;
		}
		System.out.print(solutions);
	}
}
