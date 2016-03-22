public class Problem_193 {
    public static void main(String args[]) {
        
        double twopow25 = 33554432;
        
        double twopow50 = twopow25*twopow25;
        
        double sum = twopow50;
        
        long primesquarsearr[] = new long [10000000];
        
        primesquarsearr[0] = 4;
        
        int steps = 1;
        
        boolean prime;
        
        for(int k = 3; k<=twopow25; k+=2) {
            prime = true;
            System.out.println(k);

            for(int d = 3; d<=Math.sqrt(k); d+=2) {
                if(k%d == 0) {
                    prime = false;
                    break;
                }
            }
            
            if(prime) {
                primesquarsearr[steps] = k*k;
                steps++;
            }
        }
        long takeaway;
        long addagain;
        System.out.println("typ klar");
        for(int i = 0; i<steps; i++) {
            takeaway = (long) twopow50/primesquarsearr[i];
            for(int k = i -1; k>=0; k--) {
                
            }
            
        }
        System.out.println(sum);

        
        
        
    }
}