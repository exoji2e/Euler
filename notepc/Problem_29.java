package notepc;
import java.math.BigInteger;
public class Problem_29 {
    public static int [] arrOfInt(int n, int count) {
        
        int ret[] = new int [count]; 
        
        int BIARRindx = 0; //index i bigint array
        int contrBI = 0; //kontroll om big int redan finns med eller inte
        int inputRET = 0; //tal som skall stoppas in i ret array
        int RETARRindx = 0; //index i ret array


        BigInteger all2s[] = new BigInteger[n*count];
        for (int x = 2; x<=n; x*=2) {
            inputRET = 0;

            for (int y = 2; y<=n; y++) {
                contrBI = 0;

                BigInteger twotoy = BigInteger.valueOf(x);
                twotoy = twotoy.pow(y);
                
                for (int z = 0; z<BIARRindx; z++) {
                    if (all2s[z].compareTo(twotoy) == 0) {
                        System.out.println("ok");
                        contrBI++;
                        break;
                    }
                }
                
                if(contrBI == 0) {
                    all2s[BIARRindx] = twotoy;
                    BIARRindx++;
                    inputRET++;
                }
            }
            ret[RETARRindx] = inputRET;
            RETARRindx++;
            
        }
        
        return ret;
    }
    
    public static int isNpowOf(int n, int e) {
        for(int numb = 2; numb<=Math.sqrt(n);numb++) {
            for(int exp = 2; exp<=e; exp++) {
                if (Math.pow(numb,exp) == n) {
                    return exp-1;
                }
            }
        }
        return 0;
        
    }
    
    public static void main(String args[]) {
        
        int n = 100;
        
        double i = n;
        int count = 0;
        while(i>=1) {  
            i = i/2;
            count++;
        }
        
        int arrOfTwo[] = arrOfInt(n,count+1);
        int sum = 0;
        int x = 0;
        for (int a = 2; a<=100; a++) {
            x = isNpowOf(a,count+1);
            System.out.println(x + " " + arrOfTwo[x]);

            sum+=arrOfTwo[x];
            
        }
        System.out.println(sum);
        
        
    }
}










