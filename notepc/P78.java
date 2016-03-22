import java.math.BigInteger;
public class P78 {
	public static void main(String args[]) {
		int size = 1000000;
		BigInteger [] f = new BigInteger[size];
		f[0] = BigInteger.ONE;
		int n = 0;
		while(!(f[n].mod(new BigInteger("1000000")).equals(BigInteger.ZERO))){
			n++;
			f[n] = BigInteger.ZERO;
			int m = 1;
			int pm = m*(3*m-1)/2;
			int mm = m*(3*m+1)/2;
			while(pm<=n) {
				if(m%2 == 1) {
					f[n] = f[n].add(f[n-pm]);
					if(n-mm>=0) {
						f[n] = f[n].add(f[n-mm]);
					}
				} else {
					f[n] = f[n].subtract(f[n-pm]);
					if(n-mm>=0) {
						f[n] = f[n].subtract(f[n-mm]);
					}
				}
				m++;
				pm = m*(3*m-1)/2;
				mm = m*(3*m+1)/2;
			}
		}
		System.out.println(n + " " +f[n].toString());
	}
}
	/*public static void main(String args[]) {
		int size = 10000;
		BigInteger [][] f = new BigInteger[size][size];
		f[1][1] = BigInteger.ONE;
		int n = 1;
		do {
			n++;
			f[n][1] = BigInteger.ONE;
			for(int i = 2; i<n; i++) {				
				f[n][i] = f[n][i-1].add(f[n-i][Math.min(i,n-i)]);
			}
			f[n][n] = f[n][n-1].add(BigInteger.ONE);
			System.out.println(n + " " + f[n][n].toString());
		}while(!(f[n][n].mod(new BigInteger("100")).equals(BigInteger.ZERO)));	
	}*/
