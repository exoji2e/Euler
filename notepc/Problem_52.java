import java.util.Scanner;
public class Problem_52 {
    public static int firstPrm(int N){
        String s = "" + N;
        if (s.length() > 1) {
            for(int i = 0; i<s.length()-1;i++) {
                if (Integer.parseInt(s.substring(i,i+1)) > Integer.parseInt(s.substring(i+1,i+2))) {
                    s = s.substring(0,i) + s.substring(i+1,i+2)+ s.substring(i,i+1) + s.substring(i+2,s.length());
                }
            }
            int ny = Integer.parseInt(s.substring(0,s.length()-1));
            s = ""+firstPrm(ny) + s.substring(s.length()-1,s.length());
        }
        int fP = Integer.parseInt(s.substring(0));
        return fP;
    }
    


    public static void main(String args[]) {
        int x;
        for(int i = 123456; i>1; i++) {
            x = firstPrm(i);
            if (x == firstPrm(2*i) && x == firstPrm(3*i) && x == firstPrm(4*i) && x == firstPrm(5*i) && x == firstPrm(6*i)){
                
                System.out.println(i);
                break;
            }
                
                
                
                
        }
        
        
        
    }
}