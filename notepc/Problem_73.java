public class Problem_73 {
    
    public static int[] getprimearry(int d) {
        
        int array[] = new int[10];
        
        int count = 1;
        
        while(d>1) {
            if(d%2==0) {
                if(array[1] != 2) {
                    array[1] = 2;
                    count++;
                }
                d = d/2;
            } else {
                break;
            }
        }
        
        for(int i = 3; i<=d; i+=2) {
            if(d%i == 0) {
                if(array[count] != i) {
                    array[count] = i;
                    count++;
                }
                d = d/i;
                
                i-=2;
            }
        }
        
        array[0] = count;
        return array;
        
        
        
        
    }
    
    public static void main(String args[]) {
        
        int count = -1;
        
        for(int d = 2; d<=12000; d++) {
            
            int arrayofprimes[] = getprimearry(d);
            
            for(int up = (int)(d/3 + 0.5); up < d/2; up++) {
                
                int check = 0;
                
                for(int i = 1; i<arrayofprimes[0]; i++) {
                    if(up%arrayofprimes[i] == 0) {
                        check++;
                        break;
                    }
                }
                
                if(check == 0) {
                    count++;
                }
                
            }
            
        }
        
        System.out.println(count);
        
    }
}