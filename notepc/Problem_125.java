import java.util.Scanner;
public class Problem_125 {
    
    public static boolean pallindrom(long n) {
        String s = "" +n;
        int check = 0;
        for(int step = 0; step<=(s.length()-1)/2; step++) {
            if(s.charAt(step) != s.charAt(s.length()-1-step)) {
                check++;
                break;
            }
        }
        if(check == 0) {
            return true;
        }else{
            return false;
        }
    }
    
    public static long[][] squares(int n) {
        long array[][] = new long[n+2][2];
        
        for(int i = 1; i<=n; i++) {
            array[i][0] = i*i;
        }
        return array;
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        long array[][] = squares(n);
        
        System.out.println("klarmedarray");
        
        long sum = 0;
        
        int numb = 0;
        
        int counter = 0;
        int check = 0;
        
        for(int i = 1; i<=n; i++) {
            
            sum = 0;
            
            numb = i;
            
            sum = array[numb][0];
            
            while(true) {
                numb++;
                sum += array[numb][0];
                
                if(sum >= n*n) {
                    break;
                }
                check = 0;
                if(pallindrom(sum)) {
                    for(int a = 0; a<counter; a++) {
                        if(sum == array[a][1]) {
                            check++;
                            break;
                        }
                    }
                    if(check == 0) {
                        array[counter][1] = sum;
                        counter++;

                    }
                }
            }
        }
        long publicsum = 0;
        
        for(int step = 0; step <counter; step++) {
            publicsum+=array[step][1];

        }
        
        System.out.println(publicsum);

        
        
        
        
    }
}