public class Problem_74 {
    public static int getpropsum(long n) {
        String s ="" + n;
        
        int ret = 0;
        
        for(int i = 0; i<s.length(); i++) {
            int product = 1;
            for(int j = 2; j<=Integer.parseInt(s.substring(i,i+1)); j++) {
                product*=j;
            }
            
            ret += product;
            
        }
        
        return ret;
    }
    
    public static void main(String args[]) {
    
        int count = 0;
        
        int changing;
        
        int check = 0;
        
        for(int n = 2; n<1000000; n++) {
            check = 0;
            changing = n;
            for(int c = 1; c<60; c++) {
                
                if(changing == 145 || changing == 1 || changing == 2 || changing == 40585) {
                    check++;
                    break;
                }
                
                if(c < 59 && (changing==871||changing==872||changing==45361||changing==45362)) {
                    check++;
                    break;                    
                }
                
                if(c < 58 && (changing==169||changing==1454||changing==363601)) {
                    check++;
                    break;                    
                }
                changing = getpropsum(changing);
               /* if(n == 999998) {
                    System.out.println(changing + " " + c);

                }*/

                
            }
            
            if(check == 0) {
                count++;
                System.out.println(count + " " + n);
            }
            
        }
    
    }

    
    
    
    
    
}