import java.util.Scanner;
public class Problem_92 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int changing;
        int counter = 0;
        for (int n = 2; n<N; n++) {
            changing = n;
            
            while(changing != 1 && changing != 89) {
                
                String s = "" + changing;
                
                changing = 0;
                for(int length = 0; length<s.length(); length++) {
                    int siffra = Integer.parseInt(s.substring(length,length+1));
                    changing += siffra*siffra;
                }
            }
                
            if (changing == 89) {
                counter++;
            }
        }
        
        System.out.println(counter);
    }
}