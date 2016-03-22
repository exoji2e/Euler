public class Problem_128 {
    public static boolean isNP(long N) { //Metod som kontrollerar om ett tal är ett primtal
        if (N == 2) {
            return true;
        } else if (N%2 == 0 || N == 1) {
            return false;
        }
        for (int i = 3; i<=Math.sqrt(N); i+=2) { 
            if(N%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        
        int counter = 3;
        long lastPDe3 = 8;
        
        long possprimes[] = new long[3];
        
        int PDN = 0;
        
        System.out.println(1 + " " + 1);
        System.out.println(2 + " " + 2);
        System.out.println(3 + " " + 8);


        
        for(long n = 2; counter<2000; n++) {
            
            possprimes[0] = 3*(n+1)*(n+2) - 3*n*(n+1) - 1;
            possprimes[1] = 3*n*(n+1) - 3*n*(n-1) - 1;
            possprimes[2] = 3*n*(n+1) - 3*(n-1)*(n-2) - 1;;
            
            PDN = 0;
            
            for(int i = 0; i<3; i++) {
                if(isNP(possprimes[i])) {
                    

                    PDN++;
                }
                
            }
            
            if(PDN == 3) {
                counter++;
                lastPDe3 = 3*n*(n+1) + 1;
                System.out.println(counter + " " + lastPDe3);
            }
            
            
            possprimes[1] = possprimes[0] + 2;
            possprimes[2] = 3*(n+2)*(n+3) - 3*n*(n+1) - 1;
            
            PDN = 0;
            
            for(int i = 0; i<3; i++) {
                if(isNP(possprimes[i])) {
                    PDN++;
                }
            }
            
            if(PDN == 3) {
                counter++;
                lastPDe3 = 3*n*(n+1) + 2;
                System.out.println(counter + " " + lastPDe3);
            }
            
            
            
            
        }
        
    }
}