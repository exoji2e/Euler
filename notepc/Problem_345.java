import java.util.Scanner;
import java.io.File;  
import java.io.IOException;
import java.util.Arrays;

public class Problem_345 {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Hur många rader inehåller din matrix");
        
        int n = sc.nextInt();
        
        System.out.println("vad heter din fil?");
        
        Scanner input = new Scanner(new File(sc.next()));
        
        int matrix [] [] = new int [n][n];
        int chosenrow [] = new int [n];
        int chosencol [] = new int [n];

        
        int c = 0;
        int sum = 0;

        while(input.hasNext()) {
            String s = input.nextLine();
            String sny[] = s.split(",");
            
            for(int i = 0; i<n; i++) {
                matrix[c][i] = Integer.parseInt(sny[i]);
                
            }
            chosenrow[c] = c;
            chosencol[c] = c;
            sum += matrix[c][c];

            c++;
        }
        
        int changingsum = 0;
        
        int holdcol;
        
        int holdsecol;
                
        while(sum!=changingsum) {
            if(changingsum!=0) {
                sum = changingsum;
            } else {
                changingsum = sum;
            }
            
            for(int col = n-1; col>0; col--) {
                for(int secol = n-1; secol>=0; secol--) {
                    if(matrix[chosenrow[col]][col] + matrix[chosenrow[secol]][secol] < matrix[chosenrow[col]][secol] + matrix[chosenrow[secol]][col]) {
                        changingsum+= matrix[chosenrow[col]][secol] + matrix[chosenrow[secol]][col] - (matrix[chosenrow[col]][col] + matrix[chosenrow[secol]][secol]);
                        
                        holdcol = chosenrow[col];
                        holdsecol = chosenrow[secol];
                        
                        chosenrow[col] = holdsecol;
                        chosenrow[secol] = holdcol;
                        chosencol[chosenrow[col]] = col;
                        chosencol[chosenrow[secol]] = secol;
                        
                    }
                }
            }
            
            
            for(int col = 0; col<n-1; col++) {
                for(int secol = 0; secol<n; secol++) {
                    if(matrix[chosenrow[col]][col] + matrix[chosenrow[secol]][secol] < matrix[chosenrow[col]][secol] + matrix[chosenrow[secol]][col]) {
                        changingsum+= matrix[chosenrow[col]][secol] + matrix[chosenrow[secol]][col] - (matrix[chosenrow[col]][col] + matrix[chosenrow[secol]][secol]);
                        
                        holdcol = chosenrow[col];
                        holdsecol = chosenrow[secol];
                        
                        chosenrow[col] = holdsecol;
                        chosenrow[secol] = holdcol;
                        chosencol[chosenrow[col]] = col;
                        chosencol[chosenrow[secol]] = secol;
                    }
                }
            }
            
             
            
            for(int row = n-1; row>0; row--) {
                for(int serow = n-1; serow>=0; serow--) {
                    if(matrix[row][chosencol[row]] + matrix[serow][chosencol[serow]] < matrix[serow][chosencol[row]] + matrix[row][chosencol[serow]]) {
                        changingsum+= matrix[serow][chosencol[row]] + matrix[row][chosencol[serow]] - (matrix[row][chosencol[row]] + matrix[serow][chosencol[serow]]);
                        
                        holdcol = chosencol[row];
                        holdsecol = chosencol[serow];
                        
                        chosencol[row] = holdsecol;
                        chosencol[serow] = holdcol;
                        chosenrow[chosencol[row]] = row;
                        chosenrow[chosencol[serow]] = serow;
                    }
                }
            }
           
            
            
            
            
            
                        
            for(int i = 0; i<n; i++) {
                System.out.print(chosenrow[i]+ ",");
                
            }
            System.out.println();

            System.out.println(changingsum);

        }
        
    }
}
        
        
        
