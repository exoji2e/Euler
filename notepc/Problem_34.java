package notepc;
public class Problem_34 {
    public static int facsum(int n) {
        String s = "" + n;
        int ret = 0;
        int faci;
        int a;
        for(int i = 0; i<s.length(); i++) {
            
            a = Integer.parseInt(s.substring(i,i+1));
            
            faci = 1;
            
            for (int k = a; k>1; k--) {
                faci *= k;
            }
            ret += faci;
        }
        return ret;
        
    }
    
    public static void main(String args[]) {
        
        int sum = 0;
        
        for (int i=10;i<2500000; i++) {
            if(facsum(i) == i) {
                sum+=i;
                System.out.println(i);
            }
        }
        
        System.out.println(sum);
        
        
        
    }
        
}
