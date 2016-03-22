import java.util.Scanner;
public class Problem_112 {
    public static int isNbouncy(int n) {
        String s ="" + n;
        int check1 = 0;
        int check2 = 0;
        
        for(int i = 0; i<s.length()-1; i++) {
            if (Integer.parseInt(s.substring(i,i+1)) < Integer.parseInt(s.substring(i+1,i+2))) {
                check1++;
            }
            if (Integer.parseInt(s.substring(i,i+1)) > Integer.parseInt(s.substring(i+1,i+2))) {
                check2++;
            }
        }
        
        if(check1 > 0 && check2 > 0) {
            //System.out.println(n);
            return 1;
        }
        return 0;
    }
    
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        double bouncy = 0;
        
        double proportion = sc.nextDouble();
        
        double i = 1;
        
        while(bouncy/i < proportion) {
            i++;

            bouncy+= isNbouncy((int)(i));
        }
        
        System.out.println(i);
        
    }
}