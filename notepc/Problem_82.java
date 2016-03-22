import java.util.Scanner;
import java.io.File;  
import java.io.IOException;
import java.util.Arrays;

public class Problem_82 {
    public static int getminimal(int[][] matrix, int n) {
        int ret = matrix[0][n-1];
        
        for (int i = 1; i<n; i++) {
            if(ret>matrix[i][n-1]) {
                ret = matrix[i][n-1];
            }
        }
        return ret;
        
    }
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Hur många rader inehåller din matrix");
        
        int n = sc.nextInt();
        
        System.out.println("vad heter din fil?");
        
        Scanner input = new Scanner(new File(sc.next()));
        
        int matrix [] [] = new int [n][n];
        int cost [] [] = new int [n][n];

        
        int cc = 0;
        while(input.hasNext()) {
            String s = input.nextLine();
            String sny[] = s.split(",");
            
            for(int i = 0; i<n; i++) {
                matrix[cc][i] = Integer.parseInt(sny[i]);
                cost[cc][i] = matrix[cc][i];
            }
            cc++;
        }
        
        
        
        for (int r = 0; r<n; r++) {
            for(int c = 1; c<n; c++) {
                matrix[r][c] += matrix[r][c-1];
  
            }
        }
    
        
        int saved = getminimal(matrix, n)+1;
        
        int current;
        int currcost;
        int up;
        int down; 
        int left;
        int rigth;
        
        while( true) {
            saved = getminimal(matrix,n);
            for(int c = 1; c<n; c++) {
                currcost = cost[0][c];
                current = matrix[0][c];
                left = matrix[0][c-1]+currcost;
                down = matrix[1][c]+currcost;
                
                if(left<current) {
                    matrix[0][c] = left;
                }
                if(down<current) {
                    matrix[0][c] = down;
                }
                
            }
        
            for(int r = 1; r<n-1; r++) {
                for(int c = 1; c<n; c++) {
                    currcost = cost[r][c];
                    current = matrix[r][c];
                    left = matrix[r][c-1]+currcost;
                    down = matrix[r+1][c]+currcost;
                    up = matrix[r-1][c]+currcost;
                    
                    if(left<current) {
                        matrix[r][c] = left;
                    }
                    if(down<current) {
                        matrix[r][c] = down;
                    }
                    if(up<current) {
                        matrix[r][c] = up;
                    }
                    
                }
            }
            
            for(int c = 1; c<n; c++) {
                currcost = cost[n-1][c];
                current = matrix[n-1][c];
                left = matrix[n-1][c-1]+currcost;
                up = matrix[n-2][c]+currcost;
                
                if(left<current) {
                    matrix[n-1][c] = left;
                }
                if(up<current) {
                    matrix[n-1][c] = up;
                }              
            }
            System.out.println(getminimal(matrix, n));
            
        }
    }
}
              