public class Problem_135 {
    public static void main(String args[]) {
        int staticcounter = 0;
        int counter;
        int check;
        for (int n = 1155; n<1000000; n++) {
            counter = 0;
            for(int x = 2; x<n; x++) {
                for(int d = 1; 6*x*d - 4*d*d - x*x <= n && d<=x/2; d++) {
                    
                    if(6*x*d - 4*d*d - x*x <= n) {
                        counter++;
                    }
                    if(counter > 10) {
                        x = n;
                        break;
                    }
                    
                }
            }
            
            if(counter == 10) {
                System.out.println();
                staticcounter++;
                System.out.println(staticcounter + " " + n);
            }
            
        }
    }
}