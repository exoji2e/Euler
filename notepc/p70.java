package notepc;
import java.util.ArrayList;

public class p70 {
	public static void main(String args[]) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		for(int i = 3; i<100000; i+=2) {
			boolean survived = true;
			int j = 0;
			int nxtprime = primes.get(j);
			while(nxtprime*nxtprime<i) {
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
		System.out.println(primes.toString());
		int a = 0;
		for(int i = 2; i<100000; i++) {
			a = (phi(i,primes));
		}
		System.out.println(a);
		
		
		
	}
	public static int phi(int n, ArrayList<Integer> primes) {
		int phi = n;
		for(int i = 0; i<primes.size(); i++) {
			int p = primes.get(i);
			if(n%p == 0) {
				phi = phi*(p-1)/p;
			} if(n<p) {
				break;
			}
		}
		return phi;
	}
}
