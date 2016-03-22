import java.util.Scanner;
public class Problem_51 {
    public static boolean ok(int N, int N1) {
        N += N1;

        String s = "" + N;
        String s1 = "" + N1;
        s= s.substring(s.length()-s1.length());
        String sny = ""+s.substring(0,1);
        for(int i = 1; i<s.length(); i++) {
            if(s1.substring(i,i+1).equals("0")) {
                sny += "0";
                
            }else {
                sny += s.substring(i,i+1);
            }
        }
        int x = Integer.parseInt(sny.substring(0,sny.length()));
        
        if(x%N1 == 0 && x!=0) {
            System.out.println(x + " " + N1);

            return true;
        }
        return false;
    }
        
        

    public static boolean isNP(int N) {
        if (N == 2) {
            return true;
        }
        
        if (N%2 == 0) {
            return false;
        }
        
        for (int i = 3; i<=Math.sqrt(N); i+=2) { 
            if(N%i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int[] primtalsArray(int N, int start){
        int count = N/1000 + 2000000;
        int primtal [] = new int [count];
        
        int counter = 2;
        int a = 0;
        
        for (int k = start; k<=N; k+=2) {
            if (k%2 != 0) {
                a = 0;
                
                for (int i = 3; i<=Math.sqrt(k); i+=2) { 
                    if(k%i == 0) {
                        a++;
                        break;
                    }
                }
                if (a == 0) {
                    primtal [counter] = k;
                    counter++;
                }
            }
        }
        primtal [0] = counter;

        return primtal;
    }
    public static void main(String args[]) {
        int primes[] = primtalsArray(1000000,56225);
        
        int adder[] = new int [10];
        
        adder[0] = 11100;
        adder[1] = 11010;
        adder[2] = 10110;
        adder[3] = 1110;
        adder[4] = 100110;
        adder[5] = 101010;
        adder[6] = 101100;
        adder[7] = 110010;
        adder[8] = 110100;
        adder[9] = 111000;
        
        
        int failcount = 0;
        System.out.println(primes[0]);

        for(int i = 2; i<primes[0]; i++) {
            for(int what2add = 0; what2add<10; what2add++) {
                failcount = 0;
                for(int j = 1; j<10; j++) {
                    String a ="" + primes[i];
                    String b ="" + (primes[i]+ adder[what2add]*j);
                    
                    
                    if(isNP(primes[i] + adder[what2add]*j) == false || a.length() != b.length()) {
                        failcount++;
                    }
                }
                if(failcount<3) {
                    

                    if(ok(primes[i], adder[what2add])== true) {
                        System.out.println(primes[i] + " " + adder[what2add]);
                        i = primes[0];
                        break;
                    }
                }
            }

        }
    }
}










