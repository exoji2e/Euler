package notepc;
import java.util.Scanner;
import java.io.File;  
import java.io.IOException;
import java.util.Arrays;
public class Problem_22 {
    public static void main(String args[]) throws IOException {
        
        Scanner input = new Scanner(new File("names.txt"));
        
        String s = input.next();
                
        String[] names = s.split(",");
        int x = names.length;

        for(int i = 0; i<x; i++) {
            names[i] = names[i].substring(1,names[i].length()-1);
        }

        Arrays.sort(names);
        
        int sum = 0;
        for(int n = 0; n<x; n++) {
            for (int m = 0; m<names[n].length();m++) {
                sum+=(names[n].charAt(m)-64)*(n+1);
            }
        }
        System.out.println(sum);
        
        
        
        
    }
}