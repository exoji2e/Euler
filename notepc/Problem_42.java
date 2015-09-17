package notepc;
import java.util.Scanner;
import java.io.File;  
import java.io.IOException;
import java.util.Arrays;
public class Problem_42 {
    public static boolean isNaTnumb(int T) {
        for(int i = 1; i<=T; i++) {
            if(((i+1)*i)/2 == T) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[])  throws IOException{
        
        Scanner input = new Scanner(new File("words.txt"));
        
        String s = input.next();
        
        String[] names = s.split(",");
        int x = names.length;
        
        for(int i = 0; i<x; i++) {
            names[i] = names[i].substring(1,names[i].length()-1);
        }
        
        int countTwords = 0;
        int T = 0;
        
        for (int n = 0; n<x; n++) {
            T = 0;
            for (int m = 0; m<names[n].length();m++) {
                T+=(names[n].charAt(m)-64);
                System.out.println((names[n].charAt(m)-64) +" "+ names[n].charAt(m));

            }
            if( isNaTnumb(T) == true) {
                countTwords++;
            }
        }
        System.out.println(countTwords);

        
        

        
    }
}