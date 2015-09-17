package notepc;
import java.util.Scanner;
public class Problem_44 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int pentNumb [] = new int [N];
        
        pentNumb[1] = 1;
        for (int i = 2; i<N; i++) {
            pentNumb[i] = pentNumb[i-1] + i*3 - 2;
        }
        int diff = 100000000;
        for (int n = 2; 2*n<N; n++) {
            for (int m = 1; m<n; m++) {
                for (int tot = n; tot<m+n; tot++) {
                    if(pentNumb[tot] == pentNumb[m]+pentNumb[n]) {
                        if (pentNumb[n]-pentNumb[m]<diff) {
                            System.out.println("tot = m + n " + n);
                            for(int k = 1; k<n; k++) {
                                if(pentNumb[k] == pentNumb[n]-pentNumb[m]) {
                                    diff = pentNumb[k];
                                    System.out.println(diff);
                                }
                            }
                            
                        }
                    }
                }
            }
        }
        System.out.println(diff);

    }
}
       