import java.util.Scanner;
import java.io.File;  
import java.io.IOException;
import java.util.Arrays;

public class Problem_83 {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Hur många rader inehåller din matrix");
        
        int n = sc.nextInt();
        
        System.out.println("vad heter din fil?");
        
        Scanner input = new Scanner(new File(sc.next()));
        
        int matrix [] [] = new int [n][n];
        int cost [] [] = new int [n] [n];
        
        int c = 0;
        while(input.hasNext()) {
            String s = input.nextLine();
            String sny[] = s.split(",");
            
            for(int i = 0; i<n; i++) {
                matrix[c][i] = Integer.parseInt(sny[i]);
                cost[c][i] = Integer.parseInt(sny[i]);

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
        
        int savedminimal=0;
        
        int currcost;
        
        int current;
        
        int left;
        
        int right;
        
        int up;
        
        int down;
        
        while(savedminimal!=matrix[n-1][n-1]) {
            savedminimal=matrix[n-1][n-1];
            
            for (int r = 1; r<n; r++) {
                currcost = cost[0][r];
                current = matrix[0][r];
                left = matrix[0][r-1]+currcost;
                down = matrix[1][r]+currcost;
                
                if(current>left) {
                    matrix[0][r] = left;
                }
                if(current>down) {
                    matrix[0][r] = down;
                }
                
                currcost = cost[r][0];
                current = matrix[r][0];
                up = matrix[r-1][0]+currcost;
                right = matrix[r][1]+currcost;
                
                if(current>up) {
                    matrix[r][0] = up;
                }
                if(current>right) {
                    matrix[r][0] = right;
                }
            }
            
            
            for (int numb = 1; numb+1<n; numb++) {  
                for (int row = numb; row+1<n; row++) {
                    
                    currcost = cost[numb][row];
                    current = matrix[numb][row];
                    left = matrix[numb][row-1]+currcost;
                    right = matrix[numb][row+1]+currcost;
                    up =  matrix[numb-1][row]+currcost;
                    down = matrix[numb+1][row]+currcost;
                    
                    if(current>left) {
                        matrix[numb][row] = left;
                    }
                    if(current>right) {
                        matrix[numb][row] = right;
                    }
                    if(current>up) {
                        matrix[numb][row] = up;
                    }
                    if(current>down) {
                        matrix[numb][row] = down;
                    }
                    
                    if (row+2 == n) {
                        break;
                    }
                    
                    currcost = cost[row+1][numb];
                    current = matrix[row+1][numb];
                    left = matrix[row+1][numb-1]+currcost;
                    right = matrix[row+1][numb+1]+currcost;
                    up =  matrix[row][numb]+currcost;
                    down = matrix[row+2][numb]+currcost;
                    
                    if(current>left) {
                        matrix[row+1][numb] = left;
                    }
                    if(current>right) {
                        matrix[row+1][numb] = right;
                    }
                    if(current>up) {
                        matrix[row+1][numb] = up;
                    }
                    if(current>down) {
                        matrix[row+1][numb] = down;
                    }
                }
            }
            
            for (int r = 1; r<n; r++) {
                currcost = cost[n-1][r];
                current = matrix[n-1][r];
                left = matrix[n-1][r-1]+currcost;
                up = matrix[n-2][r]+currcost;
                
                if(current>left) {
                    matrix[n-1][r] = left;
                }
                if(current>up) {
                    matrix[n-1][r] = up;
                }
                
                currcost = cost[r][n-1];
                current = matrix[r][n-1];
                up = matrix[r-1][n-1]+currcost;
                left = matrix[r][n-2]+currcost;
                
                if(current>up) {
                    matrix[r][n-1] = up;
                }
                if(current>left) {
                    matrix[r][n-1] = left;
                }
            }
            
            
            
            
            
        }
        System.out.println(matrix[n-1][n-1]);

        
        
        
        
        
    }
    
}