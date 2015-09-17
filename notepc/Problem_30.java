package notepc;
public class Problem_30 {
    public static boolean fivePow(int i) {
        String s = "" + i;
        int x = 0;
        for (int j = 0; j<s.length(); j++) {
            x += (int)(Math.pow(Integer.parseInt(s.substring(j,j+1)),5));
        }
        if(x == i) {
            return true;
        }
        return false;
        
    }
    
    public static void main(String args[]) {
        double time = (double)(System.currentTimeMillis());
        
        int sum = 0;
        
        for(int i = 10; i<354295; i++) {
            if(fivePow(i)==true) {
                System.out.println(i);

                sum+=i;
            }
        }
        System.out.println(sum);
        double newtime = (double)(System.currentTimeMillis());
        
        double ret = (newtime-time)/1000;
        System.out.println("Det tog " + ret + " sekunder");
        
        
    }
}