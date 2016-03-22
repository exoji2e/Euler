import java.util.Scanner;
public class Problem_86 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int stopcount = sc.nextInt();
        
        double check;
        int length;
        int counter = 0;
        int M1 = 1;
        int M2 = 1;
        int M3 = 2;
        
        while(stopcount > counter) {
            M2 = 1;
            while(M2<=M1) {
                M3 = 1;
                while(M3<=M2) {
                    length = (int) (Math.sqrt(M1*M1 + (M2+M3)*(M2+M3)));
                    check = Math.sqrt(M1*M1 + (M2+M3)*(M2+M3));
                    
                    if(length == check) {
                        counter++;
                    }
                    M3++;
                    
                }
                M2++;

            }
            M1++;

        }
        
        System.out.println(M1-1);
        
        
        
        
        
    }
    

}