import java.util.Scanner;
import java.io.File;  
import java.io.IOException;
import java.util.Arrays;

public class Problem_99 {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        double max = 0;
                
        System.out.println("vad heter din fil?");
        
        Scanner input = new Scanner(new File(sc.next()));
        int saved = 0;
        int c = 1;
        while(input.hasNext()) {
            String s= input.nextLine();
            
            String imported[] = s.split(",");
            
            double base = Double.parseDouble(imported[0].substring(0));
            double exp = Double.parseDouble(imported[1].substring(0));
            
            if(exp*Math.log(base) > max) {
                max = exp*Math.log(base);
                saved = c;
                
                System.out.println(max + " " + saved);
            }
            c++;
 
        }
    }
}
