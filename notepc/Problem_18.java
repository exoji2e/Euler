package notepc;
import java.util.Scanner;
import java.io.File;  
import java.io.IOException; 
public class Problem_18 {
    
    public static int[][] scanTri(String[] s, int i) {
        int triangel [] [] = new int [i] [i];

        for (int a = 0; a<i; a++) {
            for (int b = 0; b<=(s[a].length()-2)/3; b++) {
                int x = b*3;
                triangel [a] [b] = Integer.parseInt(s[a].substring(x,x+2));
                //System.out.println(triangel [a] [b]);
            }
        }
        return triangel;
    }
        

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hur många rader inehåller din triangel");
        
        int n = sc.nextInt();

        
        System.out.println("vad heter din fil?");
        File triangeltext = new File(sc.next());
        
        Scanner input = new Scanner(triangeltext);

        String s[] = new String[n];
        int c = 0;
        while(input.hasNext()) {
            s[c] = input.nextLine();
            c++;
        }

        int triangel [] [] = scanTri(s,n);
        
        int sum = 0;
        for(int i = n-2; i>=0; i--) {
            for(int j = 0; j<=i; j++) {
                if(triangel[i+1][j]>=triangel[i+1][j+1]) {
                    triangel[i][j] += triangel[i+1][j];
                    //System.out.println(triangel [i] [j]);

                }
                else {
                    triangel[i][j] += triangel[i+1][j+1];
                    //System.out.println(triangel[i][j]);
                }
                
            }
            
        }
        System.out.println(triangel[0][0]);
        
        
    }

}