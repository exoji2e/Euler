import java.util.ArrayList;
import java.math.BigInteger;

public class P77 extends EulerProblem {
	private int size;
	public P77 (int size){
		problemNumber = 77;
		this.size = size;
	}
	public P77 (){
		problemNumber = 77;
		this.size = 5000;
	}
	@Override
	protected void execute() {
		int sz = size/10 + 100;
		ArrayList<Long> pl = primeList(sz);
		BigInteger [][] f = new BigInteger[sz][sz];
		f[1][1] = BigInteger.ZERO;
		f[2][1] = BigInteger.ZERO;
		f[2][2] = BigInteger.ONE;
		int n = 2;
		do {
			n++;
			f[n][1] = BigInteger.ZERO;
			if(n%2 == 0) {
				f[n][2] = BigInteger.ONE;
			} else {
				f[n][2] = BigInteger.ZERO;
			}
			int i = 3;
			int pind = 0;
			for(; i<n; i++) {
				if(i == pl.get(pind+1)) {
					f[n][i] = f[n][i-1].add(f[n-i][Math.min(i,n-i)]);
					pind++;
				} else {
					f[n][i] = f[n][i-1];
				}	
			}
			if(pl.get(pind+1) == n) {
				f[n][n] = f[n][n-1].add(BigInteger.ONE);
			} else {
				f[n][n] = f[n][n-1];
			}
		}while(f[n][n].compareTo(new BigInteger("" + size))<0);
		System.out.print(n + "\t");

	}

	@Override
	protected void input() {
		System.out.print(size);
	}

}
