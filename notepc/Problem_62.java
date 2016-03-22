import java.util.Scanner;
import java.math.BigInteger;
public class Problem_62 {
    public static BigInteger lastPrm(BigInteger n){
        String s = "" + n;
        
        if (s.length() > 1) {
            for(int i = 0; i<s.length()-1;i++) {
                if (Integer.parseInt(s.substring(i,i+1)) < Integer.parseInt(s.substring(i+1,i+2))) {
                    s = s.substring(0,i) + s.substring(i+1,i+2)+ s.substring(i,i+1) + s.substring(i+2,s.length());
                }
            }
            BigInteger ny = new BigInteger(s.substring(0,s.length()-1));
            s = ""+lastPrm(ny) + s.substring(s.length()-1,s.length());
        }
        BigInteger ret = new BigInteger(s.substring(0)); 
        return ret;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        BigInteger array[][] = new BigInteger [3][n];
        
        BigInteger cube;
            
        int counter = 0;
        
        int control = 0;
        
        BigInteger prm1;
        BigInteger one = new BigInteger("1");
        
        
        int numb = 1;
        
        for(int i = 1; i<=n; i++) {
            
            cube = BigInteger.valueOf(i);
            cube = cube.pow(3);
            
            prm1 = lastPrm(cube);
            
            control = 0;
            for(int k = 0; k<=counter; k++) { 
                if(prm1.equals(array[0][k])) {
                    control++;
                    array[1][k] = array[1][k].add(one);
                    numb = k;
                    
                }
            }
            if(control == 0) {
                array[0][counter] = prm1;
                array[1][counter] = one;
                array[2][counter] = cube;

                counter++;
            }
            if(numb != 1 && array[1][numb].intValue() == 5) {
                System.out.println(cube + " " + prm1 + " " + i + " " + array[2][numb]);
                break;
            }
            
            
            
        }
        
        
        
    }
}