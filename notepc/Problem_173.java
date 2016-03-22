public class Problem_173 {
    public static void main(String args[]) {
        double time = System.currentTimeMillis();
        long count = 0;
        for(long large = 3; 4*large<1000005; large++) {
            for(long small = large-2; large*large-small*small<1000001 && small>0; small-=2) {
                count++;
            }
        }
        System.out.println(count + " " + (System.currentTimeMillis()-time)/1000);
    }
}