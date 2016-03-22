import java.math.BigInteger;
import java.util.Arrays;
public class Problem_119 {
    public static int didgitsum(BigInteger n) {
        String s = "" + n;
        
        int sum = 0;
        
        for(int i = 0; i<s.length(); i++) {
            sum += Integer.parseInt(s.substring(i,i+1));
            
        }
        return sum;
    }
    
    public static void main(String args[]) {
        
        BigInteger longarr [] = new BigInteger[10000];
        longarr[0] = BigInteger.valueOf(0);
        int place = 1;
        
        for(int exp = 2; exp<50; exp++) {
            
            for(int start = 3; start<1000; start++) {
                
                BigInteger tal = BigInteger.valueOf(start).pow(exp);
                
                if(didgitsum(tal) == start) {
                    longarr[place] = tal;
                    place++;
                    //System.out.println(tal);
                }
            }
        }
        
        BigInteger realarr[] = new BigInteger[place];
        
        for(int i = 0; i<place; i++) {
            realarr[i] = longarr[i];
        }
        
        Arrays.sort(realarr);
        
        System.out.println(realarr[30]);
        
        
        
    }
}