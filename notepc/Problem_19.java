package notepc;
public class Problem_19 {
    public static void main(String[] args) {
        int array[] = new int[1200];
        int count = 0;
        int i = 0;
        int year = 1901;
        while(count<1188) {
            array[count] = i;
            i+=31;
            count++;
            array[count] = i;
            if (year%4 == 0) {
                i++;
            }
            i+=28;
            count++;
            array[count] = i;
            i+=31;
            count++;
            array[count] = i;
            count++;
            i+=30;
            array[count] = i;
            i+=31;
            count++;
            array[count] = i;
            i+=30;
            count++;
            array[count] = i;
            i+=31;
            count++;
            array[count] = i;
            i+=31;
            count++;
            array[count] = i;
            i+=30;
            count++;
            array[count] = i;
            i+=31;
            count++;
            array[count] = i;
            i+=30;
            count++;
            array[count] = i;
            i+=31;
            count++;
            year++;
        }
        int print = 0;
        for(int n = 0; n<=count; n++) {
            if (array[n]%7 == 6) {
                print++;
            }
        }
        System.out.println(print);
    }
}