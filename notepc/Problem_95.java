public class Problem_95 {
    public static int Divsum(int n) {
        int sum = 1;
        for(int d = 2; d<n; d++) {
            if(n%d == 0) {
                sum+=d;
            }
        }
        return sum;
        
    }
    public static void main(String args[]) {
        
        boolean array[] = new boolean[1000000];
        int length;
        int maxlength = 0;
        int savedstart = 0;
        
        for(int start = 1; start<1000000; start++) {
            int newpart = start; 
            
            length = 0;
            
            while(newpart<1000000 && false == array[newpart]) {
                array[newpart] = true;
                newpart = Divsum(newpart);
                length++;
            }
            
            if(length>maxlength && newpart < 1000000 && newpart > start) {
                int tmp = newpart;
                while(tmp<1000000 && array[tmp]) {
                    array[tmp] = false;
                    tmp = Divsum(tmp);
                }
            }
            
            if(newpart==start && length>maxlength) {
                savedstart = start;
                maxlength = length;
            }
            System.out.println(maxlength + " " + savedstart + " " + start);

            
        }
        System.out.println(maxlength + " " + savedstart);
    }
}