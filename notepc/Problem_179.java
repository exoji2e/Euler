public class Problem_179 {
    public static int Divs(int array[][],int step) {
        
        int ways = 1;
        
        for(int i = 1; i<=step; i++) {
            ways *= (array[1][i] + 1);
        }
        
        
        return ways;
    }
    
    public static void main(String args[]) {
        
        double time = System.currentTimeMillis();
        
        int array [][] = new int [2][10];
        
        int savedDs = 0;
        
        int step = 0;
        
        int k;
        
        int count = 0;
        
        for(int n = 2; n<=10000000; n++) {
            k = n;
            step = 0;
            for(int i = 2; i<=Math.sqrt(k)+2; i+=2) {
                if(i == 4) {
                    i--; 
                }
                if(k%i == 0) {
                    if(i!=array[0][step]) {
                        step++;
                    }
                    array[0][step] = i;
                    array[1][step]++;
                    k = k/i;
                    i-=2;
                }
            }
            
            if(k!=array[0][step] && k!=1) {
                step++;
                array[0][step] = k;
                array[1][step]++;
            } else if (k!=1){
                array[1][step]++;
            }
            
            //System.out.println(n + " " + count +" " + Divs(array,step));

            
            if(savedDs == Divs(array,step)) {
                count++;
                //System.out.println(n + " " + count +" " + Divs(array,step));
            } else {
                savedDs = Divs(array,step);
            }
            for(int i = 0; i<10;i++) {
                array[0][i] = 0;
                array[1][i] = 0;
            }
            
            
        }
        System.out.println(count + " " + (System.currentTimeMillis()-time)/1000);
        
        
    }
}