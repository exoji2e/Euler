package notepc;
import java.math.BigInteger;
public class p100 {
	public static void main(String args[]) {
		
		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		BigInteger sqrt2 = new BigInteger("1414213562374");
		BigInteger sqrt210 = new BigInteger("1000000000000");
		BigInteger b = new BigInteger("1000000");
		BigInteger n = new BigInteger("707106781186");
		boolean cont = true;
		while(cont) {
			BigInteger k = n.multiply(sqrt2).divide(sqrt210);
			BigInteger left = n.multiply(n.subtract(one)).multiply(two);
			BigInteger right = k.multiply(k.subtract(one));
			int a = left.compareTo(right);

			while(a <= 0 ) {
//				if(a == 0) {
//					System.out.println("print d");
//					cont = false;
//					break;
//				}
				k = k.subtract(one);
				right = k.multiply(k.subtract(one));
				a = left.compareTo(right);

			}
			if(n.mod(b).intValue() == 0) {
				System.out.println(n.toString());
			}
			n = n.add(one);

			
		}	
	}
}
