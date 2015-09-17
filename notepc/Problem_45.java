package notepc;
public class Problem_45 {
    public static boolean isNPent(double Tn) {
        double x = 1;
        for(int n = 2; n<=Tn; n++) {
            x += 3*n - 2 ;
            if(x == Tn) {

                return true;
            }
            if(x > Tn) {
                return false;
            }
        }
        return false;
    }
    public static boolean isNHex(double Tn) {
        double x = 1;
        for(int n = 1; n<=Tn; n++) {
            x += 4*n + 1;

            if(x == Tn) {

                return true;
            }
            if(x > Tn) {
                return false;
            }
        }
        return false;    
    
    
    }
    public static void main(String args[]) {
        double Tn = 1;
        
        for(int n = 2; n<100000; n++) {
            Tn += n;

            if(isNHex(Tn) == true && isNPent(Tn) == true) {
                System.out.println(Tn + " " + n);
            }
            

        }
        
        
        
    }
}