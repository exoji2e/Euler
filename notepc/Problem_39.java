package notepc;
public class Problem_39 {
    public static void main(String args[]) {
        int c;
        int solC = 0;
        int savedsolC = 0;
        int savedP = 0;
        
        
        for (int p = 120; p<=1000; p++) {
            solC = 0;
            for (int a = 1; a<p/3; a++) {
                for (int b = a; b<p/2; b++) {
                    c = p-(a+b);
                    if(c*c == a*a + b*b) {
                        solC++;
                    }
                    
                }
            }
            if (solC>savedsolC) {
                savedsolC = solC;
                savedP = p;
            }
        }
        System.out.println(savedP);
    }
}