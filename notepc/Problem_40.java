package notepc;
public class Problem_40 {
    public static char fracD(int n) {
        int c = 1;
        int x =1;
        int tal = n;
        int a = n;
        if(n>9) {
            for(int i = 1; i<=tal; i*=10){

                if(n<i*9*c) {
                    if (n ==1) {
                        tal = i;
                        break;
                    }
                    tal = (int) (i-1 + n/c);
                    break;
                }
                
                n -= i*9*c;
                
                c++;
            }

        }
        int siffra = n%c;

        if(tal>9) {
            siffra = (n-1)%c;
        }
        

        
        
        String t ="" + tal;
        
        
        return t.charAt(siffra);
        
        
        
        
    }
    
    public static void main(String args[]) {
        
        System.out.println(fracD(10));
        
        int product = 1;
        
        for(int i = 0;i<7;i++) {
            int x = (int) (Math.pow(10,i));
            System.out.println(product+ " " + fracD(x));

            product *= Character.getNumericValue(fracD(x));
            
        }
        System.out.println(product);
        
    }
}