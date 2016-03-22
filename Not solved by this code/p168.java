package notepc;
import java.math.BigInteger;


public class p168 {
	public static int mod7(int l) {
		String s = "";
		for(int i = 0; i<l; i++) {
			s = s+"9";
		}
		BigInteger b9 = new BigInteger(s);
		BigInteger seven = new BigInteger("7");
		BigInteger M = new BigInteger("100000");
		if(b9.mod(seven).intValue() == 0) {
			return b9.divide(seven).mod(M).intValue() + b9.multiply(new BigInteger("2")).divide(seven).mod(M).intValue();
		}
		return 0;
		
	}
	
	public static void main(String args[]) {
		int sum = 0;
		int sum2 = 0;
		for(int l = 2; l<=99; l++) {
			if (l == 2) 
				sum += 13*11;
			else if (l == 3)
				sum+= 13*111;
			else if(l == 4)
				sum +=13*1111;
			else
				sum+= 13*11111;
			
			sum = sum%100000;
			int a = mod7(l);
			sum2+=a;
			sum2 = sum2%100000;
		}
		System.out.println(sum+ " " + sum2);
	}
	
		
	
}
