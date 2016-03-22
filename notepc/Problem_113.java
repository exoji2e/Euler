import java.util.Scanner;
public class Problem_113 {
    
    public static long recursive(int length, int last) {
        
        int ret = 0;
        
        if(length>0) {
            for(int i = last+1; i<10; i++) {
                ret+=recursive(length-1, i);
            }
            if(last == 9) {
                ret = length+1;
            }
        } else {
            return 1;
        }
        
        return ret;
    }
    public static long recursive2(int length, int last) {
        
        int ret = 0;

        
        if(length>0) {
            for(int i = last-1; i>0; i--) {
                ret+=recursive(length-1, i);
            }
            if(last == 0) {
                ret = length+1;
            }
        } else {
            return 1;
        }
        
        return ret;
    }
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.println((recursive(n,0)-2) + recursive2(n,9)-2 + 9*n-9);
        
        
        
    }
}