public class Problem_174 {
    public static void main(String args[]) {
        double time = System.currentTimeMillis();
        long tiles [] = new long [1000001];
        long count = 0;
        for(long large = 3; 4*large<1000005; large++) {
            for(long small = large-2; large*large-small*small<1000001 && small>0; small-=2) {
                tiles[(int)(large*large-small*small)]++;
            }
        }
        for(int i = 1; i<1000001; i++) {
            if(tiles[i]>0 && tiles[i]<11) {
                count++;
            }
        }
        System.out.println(count + " " + (System.currentTimeMillis()-time)/1000);
    }
}