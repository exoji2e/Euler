package notepc;
import java.math.BigInteger;

public class p66 {

	public static int [] getCF(int n) {
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
	public static BigInteger[] getCanidate(int[] cf, int c) {
		BigInteger nom;
		BigInteger denom;
		if(c>1) {
			nom = BigInteger.ONE;
			denom = new BigInteger(""+cf[c-1]);
			BigInteger tmpnom;
			BigInteger tmpdenom;
			for(int i = c-2; i>0; i--) {
				tmpnom = denom.add(BigInteger.ZERO);
				tmpdenom = new BigInteger(""+cf[i]).multiply(denom).add(nom);
				nom = tmpnom.add(BigInteger.ZERO);
				denom = tmpdenom.add(BigInteger.ZERO);
			}
			nom = nom.add(denom.multiply(new BigInteger(""+cf[0])));
			
		} else {
			nom = new BigInteger(""+cf[0]);
			denom = BigInteger.ZERO;
			
		}
		BigInteger a[] = new BigInteger[2];
		a[0] = nom;
		a[1] = denom;
		return a;
	}
	
	
	public static void main(String args[]) throws InterruptedException {
		int size = 1000;
		long time = System.currentTimeMillis();
		int [][] field = new int[size][10+size/10];
		for(int i = 13; i<size; i++) {
			int [] cf = getCF(i);
			for(int j = 0; j<cf.length; j++) {
				if(cf[j] == 0) {
					field[i][0] = j;
					break;
				}
				field[i][j+1] = cf[j];
			}

		}
		
		long maxD = 13;
		BigInteger maxX = BigInteger.ZERO;
		
		for(int i = 13; i<size; i++) {
			if(Math.sqrt(i)%1 == 0) {
				i++;
			}
			boolean sol = false;
			int j = 1;
			while(!sol){
				int cf[] = new int[j];
				for(int k = 0; k<j-1; k++) {
					cf[k+1] = field[i][k%(field[i][0]-1) + 2];
				}
				cf[0] = field[i][1];
				
				BigInteger ps[] = getCanidate(cf,j);
				if(ps[0].multiply(ps[0]).subtract(new BigInteger(""+i).multiply(ps[1]).multiply(ps[1])).equals(BigInteger.ONE)){
					sol = true;
					if(ps[0].compareTo(maxX)>0) {
						maxX = ps[0].add(BigInteger.ZERO);
						maxD = i;
					}
				}
				j++;
			}
		}
		System.out.println("The maximal minimal solution for D<" + size + " is x = "+ maxX + " for D = " + maxD);
		System.out.println("It took " + (System.currentTimeMillis()-time) + " ms to compute");
		
		
		
		
	}
}
