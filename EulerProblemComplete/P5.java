import java.math.BigInteger;
import java.util.ArrayList;
public class P5 extends EulerProblem {
	long n = 20;
	public P5(){
		problemNumber = 5;
	}
	public P5(long n) {
		this.n = n;
		problemNumber = 5;
	}
	@Override
	protected void execute() {
		ArrayList<Long> al = primeList(n);
		BigInteger nB = new BigInteger(""+n);
		BigInteger prod = BigInteger.ONE;
		for(long p:al) {
			BigInteger thisp = new BigInteger(""+p);
			BigInteger pprod = new BigInteger(""+p);
			while(pprod.compareTo(nB)<=0) {
				pprod = pprod.multiply(thisp);
			}
			prod = prod.multiply(pprod).divide(thisp);
		}
		System.out.print(prod.toString());
	
		
	}

	@Override
	protected void input() {
		System.out.print(n);
		
	}
}
