package notepc;
import java.math.BigInteger;
public class Problem_26 {
    public static void main(String args[]) {
        
        
        int maxten = 5;
        long savevalue = 1;
        BigInteger value = BigInteger.valueOf(0);
        BigInteger comparevalue = BigInteger.valueOf(0);
        BigInteger ten = BigInteger.valueOf(10);
        BigInteger one = BigInteger.valueOf(1);
        int holdthewhileloop = 0;
        int tenpow = 1;

        for (int d = 7; d<1000; d++) {
            holdthewhileloop = 0;
            tenpow = 1;

            while(tenpow<2000 && holdthewhileloop==0)   {
                for (int tenten = 0; tenten<6; tenten++) {
                    
                    BigInteger Bd = BigInteger.valueOf(d).multiply(ten.pow(tenten));

                    BigInteger ninesequence = ten.pow(tenpow).subtract(one);


                    value = ninesequence.divide(Bd);
                    comparevalue = value.multiply(Bd);
                    if(ninesequence.equals(comparevalue)) {
                        if(tenpow > maxten) {
                            maxten = tenpow;
                            savevalue = d;
                        }
                        System.out.println(d);
                        holdthewhileloop = 1;

                        break;
                    }
                }
                tenpow++;
            }
        }
        System.out.println(maxten + " " + savevalue);
        
        
        
        
        
    }
}