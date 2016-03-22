import java.util.ArrayList;
import java.math.BigInteger;
public abstract class EulerFunctionCollector {
	
	public ArrayList<Long> primeList(long n) {
		ArrayList<Long> primes = new ArrayList<Long>();
		primes.add((long)2);
		for(long i = 3; i<n; i+=2) {
			boolean survived = true;
			int j = 0;
			long nxtprime = primes.get(j);
			long sqi = (long) Math.sqrt(i);
			while(nxtprime<=sqi) {
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
		return primes;
	}
	public ArrayList<Integer> primeListOfN(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		int added = 1;
		for(int i = 3; added<n; i+=2) {
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
				added++;
			}
		}
		return primes;
	}
	public int gcd(int n, int m) {
		if(n%m == 0) {
			return m;
		} else {
			return gcd(m,n%m);
		}
	}
	
	public static int [] sqrtCF(int n) {
		if(Math.sqrt(n)%1 == 0) {
			return new int [1];
		}
		int cf [] = new int [n+10];
		int m = (int)Math.sqrt(n);
		int b;
		int c;
		int i = 1;
		int t1;
		int s1;
		cf[0] = m;
		b = m;
		c = n-m*m;
		while(c != 1){
			cf[i] = (int) (Math.sqrt(n) + b)/c;
			t1 = (c*cf[i]-b);
			s1 = (n-t1*t1);
			b = t1;
			c = s1/c;
			i++;
		}
		cf[i] = cf[0] + b;

		return cf;
	}
	
	

}
