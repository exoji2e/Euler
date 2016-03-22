import java.util.Scanner;
public class Problem_145 {
    
    public static boolean isNreversible(String tal) {
        String reversetal = "";
        for(int i = tal.length()-1; i>=0; i--) {
            reversetal += tal.charAt(i);
        }
        
        long total = Long.parseLong(tal) + Long.parseLong(reversetal);
        
        String totaln = "" + total;
        
        for(int j = 0; j<totaln.length(); j++) {
            if(Integer.parseInt(totaln.substring(j,j+1))%2 == 0) {
                return false;
            }
        }
        return true;
        
        
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextInt();
        
        
        
        String tal;
        String reversetal;
        int counter = 0;
        
        
        
        for(long i = 11; i<n; i+=2) {
            tal = "" + i;
            if(Integer.parseInt(tal.substring(0,1))%2 == 0) {
                if(isNreversible(tal)) {
                    counter+=2;
                    System.out.println(counter + " " + tal);


                }  

            } else {
                i += Math.pow(10,tal.length()-1);
                i-=2;
                System.out.println(counter + " " + tal);

            }
        }
        System.out.println(counter);
        
    }
    
}