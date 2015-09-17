package notepc;
public class Problem_36 {
    
    public static boolean palindrom(String s) {
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
    
    
    
    public static void main(String args[]) {
        int sumOfPalls = 0;
        for(int number = 1; number<1000000; number++) {
            int n = number;
            String snumber = "" + number;
            if(palindrom(snumber) == true) {
                String base2 = "";
                while(n>=1) {
                    base2 = n%2 +"" + base2;
                    n = (int) (n/2);
                }
                if(palindrom(base2) == true) {
                    sumOfPalls+=number;
                    System.out.println(number + " " + base2);
                }
                
            }
        }
        System.out.println(sumOfPalls);
    }
}