import java.util.Scanner;
import java.io.File;  
import java.io.IOException;
import java.util.Arrays;

public class Problem_102 {
    static double coords [] = new double [6];
    
    public static int adder(double xy, int m, int n, int yorx) {
        int a = (2*(m-1)+yorx);
        int b = (2*(n-1)+yorx);
        
        if(xy<=coords[a] && xy>=coords[b]) {
            if (xy<0) {
                if(yorx == 0) {
                    return 1;

                } else {
                    return 10;

                }
            } else {
                if(yorx == 0) {
                    return 100;

                } else {
                    return 1000;
                }
            }

        } else if(xy>=coords[a] && xy<=coords[b]) {
            if (xy<0) {
                if(yorx == 0) {
                    return 1;
                    
                } else {
                    return 10;
                    
                }
            } else {
                if(yorx == 0) {
                    return 100;
                    
                } else {
                    return 1000;
                    
                }
            }

        }
        return 0;
        
    }
    
    
    public static void main(String args[]) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("vad heter din fil?");
        
        Scanner input = new Scanner(new File(sc.next()));
        
        double k [] = new double [3];
        
        double x;
        double y;
        int count = 0;
        int sum;
        
        while(input.hasNext()) {
            String s = input.nextLine();
            String sny[] = s.split(",");
            
            for(int i = 0; i<6; i++) {
                coords[i] = Double.parseDouble(sny[i]);
            }
            
            if(coords[0] == coords[2]) {
                k[0] = 9999;
            } else {
                k[0] = (coords[1]-coords[3])/(coords[0]-coords[2]);
            }
            
            if(coords[0] == coords[4]) {
                k[1] = 9999;
            } else {
                k[1] = (coords[1]-coords[5])/(coords[0]-coords[4]);
            }
            
            if(coords[2] == coords[4]) {
                k[2] = 9999;
            } else {
                k[2] = (coords[3]-coords[5])/(coords[2]-coords[4]);
            }
            
            sum = 0;
            
            if(k[0] == 9999) {
                x = coords[0];
                sum+=adder(x, 1, 2, 0);

            } else {
                x = coords[0] - coords[1]/k[0];
                y = coords[1] - k[0]*coords[0];
                sum+=adder(x, 1, 2, 0);
                sum+=adder(y, 1, 2, 1);
            }
            
            if(k[1] == 9999) {
                x = coords[0];
                sum+=adder(x, 1, 2, 0);
                
            } else {
                x = coords[0] - coords[1]/k[1];
                y = coords[1] - k[1]*coords[0];
                sum+=adder(x, 1, 3, 0);
                sum+=adder(y, 1, 3, 1);
            }
            if(k[2] == 9999) {
                x = coords[2];
                sum+=adder(x, 1, 2, 0);
                
            } else {
                x = coords[2] - coords[3]/k[2];
                y = coords[3] - k[2]*coords[2];
                sum+=adder(x, 2, 3, 0);
                sum+=adder(y, 2, 3, 1);
            }
            int check = 0;
            String su = "" + sum;
            for(int i = 0; i<su.length(); i++) {
                if(Integer.parseInt(su.substring(i,i+1)) == 0) {
                    check++;
                    break;
                }
            }
            
            if(check == 0 && su.length() == 4) {
                count++;
                //System.out.println(count);
            }
        }
        System.out.println(count);

    }
}
                       
                       
                

            
            
            
            
            
            
            
