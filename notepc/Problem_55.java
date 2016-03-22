import java.math.BigInteger;
public class Problem_55 {
    public static BigInteger reverseInt(BigInteger n) {
        String s = n.toString();
        
        String ny = "";
        
        for (int i = s.length()-1; i>=0; i--) {
            ny += s.charAt(i);
        }
                
        return new BigInteger(ny);
        
    }
    
    public static boolean palindrom(String s) {
        int check = 0;
        for(int step = 0; step<=(s.length()-1)/2; step++) {
            if(s.charAt(step) != s.charAt(s.length()-1-step)) {
                check++;
                break;
            }
        }
        if(check == 0) {
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String args[]) {
        int Lynchelcount = 9990;
        
        for(int i = 10; i<10000; i++) {
            
            BigInteger numb = BigInteger.valueOf(i);
            
            for(int itterations = 1; itterations<50; itterations++) {
                numb = numb.add(reverseInt(numb));
                String possiblepall = numb.toString();
                if(palindrom(possiblepall) == true) {
                    Lynchelcount--;
                    break;
                }
                
            }
            System.out.println(i);
            
        }
        System.out.println(Lynchelcount);


    }
}