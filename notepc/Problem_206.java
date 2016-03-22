import java.math.BigInteger;
public class Problem_206 {
    public static boolean rightForm(BigInteger numb) {
        String s = "" + numb;
        
        if(s.charAt(0) == ('1') && s.charAt(2) == ('2') && s.charAt(4) == ('3') && s.charAt(6) == ('4') && s.charAt(8) == ('5') && s.charAt(10) == ('6') && s.charAt(12) == ('7') && s.charAt(14) == ('8') && s.charAt(16) == ('9')) {
            return true;
        }
        
        return false;
        
        
    }
    
    public static void main(String args[]) {
        long number = 1010101010;
        BigInteger Bnumber = BigInteger.valueOf(0);
        
        while(number < 1389026623) {
            number +=10;
            if(number%4 != 0) {
                //System.out.println(number);

                Bnumber = BigInteger.valueOf(number).pow(2);
                if(rightForm(Bnumber)) {
                    System.out.println(number);
                    break;
                }
            }
            
            
        }
        
        
        
        
    }
}