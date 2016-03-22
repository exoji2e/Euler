package notepc;
import java.math.BigInteger;
import java.math.BigDecimal;


public class P527 {
	public static void main(String args[]) {
		BigInteger ten = new BigInteger("10");
		BigInteger tt = ten.pow(10);
		BigInteger added = BigInteger.ZERO;
		BigInteger sum = BigInteger.ZERO;
		BigInteger toAdd = BigInteger.ONE;
		BigInteger amounttoAdd = BigInteger.ONE;
		BigInteger two = new BigInteger("2");
		while(tt.compareTo(added.add(amounttoAdd))>0){
			added = added.add(amounttoAdd);
			sum = sum.add(toAdd.multiply(amounttoAdd));
			toAdd = toAdd.add(BigInteger.ONE);
			amounttoAdd = amounttoAdd.multiply(two);
		}
		sum = sum.add(toAdd.multiply(tt.subtract(added)));
		BigDecimal ttd = new BigDecimal(tt);
		BigDecimal sumd = new BigDecimal(sum);
		
		BigDecimal Hn = new BigDecimal("23.603066594891989");
		
		BigDecimal threed = new BigDecimal("3");
		BigDecimal twod = new BigDecimal("2");
		BigDecimal oned = new BigDecimal("1");
		BigDecimal Rd = twod.multiply(ttd.add(oned)).multiply(Hn).divide(ttd).subtract(threed);
		BigDecimal Bd = sumd.divide(ttd);
		System.out.println(Rd.subtract(Bd));
			
		
	}
}
