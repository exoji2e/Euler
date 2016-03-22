import java.util.Scanner;
import java.io.File;  
import java.io.IOException;
import java.util.Arrays;

public class Problem_81 {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Hur många rader inehåller din matrix");
        
        int n = sc.nextInt();
        
        System.out.println("vad heter din fil?");
        
        Scanner input = new Scanner(new File(sc.next()));
        
        int matrix [] [] = new int [n][n];

        int c = 0;
        while(input.hasNext()) {
            String s = input.nextLine();
            String sny[] = s.split(",");
            
            for(int i = 0; i<n; i++) {
                matrix[c][i] = Integer.parseInt(sny[i]);
            }
            c++;
        }
        
        
                
        for (int r = 1; r<n; r++) {
            matrix[0][r] += matrix[0][r-1];
            matrix[r][0] += matrix[r-1][0];
        }
        
        for (int numb = 1; numb<n; numb++) {  
            for (int row = numb; row<n; row++) {
                if(matrix[numb-1][row] < matrix[numb][row-1]) {
                    matrix[numb][row] += matrix[numb-1][row];
                } else {
                    matrix[numb][row] += matrix[numb][row-1];
                }
                if (row+1 == n) {
                    break;
                }
                
                if(matrix[row][numb] < matrix[row+1][numb-1]) {
                    matrix[row+1][numb] += matrix[row][numb];
                } else {
                    matrix[row+1][numb] += matrix[row+1][numb-1];
                }
            }
        }
        System.out.println(matrix[n-1][n-1]);
        
        
    }
    
}