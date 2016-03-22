public class Problem_75{
    public static int gcdNy(int m, int n) {

        for (int i = n; i>0; i--) {
            if(m%i == 0 && n%i == 0) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String args[]) {
        
        int Larray[] = new int [1500001];
        
        int x = 1;
        int a;
        int b;
        int c;
        int tmp = 0;

        for(int m = 2; m<900; m++) {
            for(int n = 1; n<m; n++) {
                if(gcdNy(m,n) == 1) {
                    int p = 2*m*(m+n);
                    if(p > 100000000) {
                        break;
                    }
                    a = m*m - n*n;
                    b = 2*m*n;
                    c = m*m + n*n;
                    for (int i = 2; i<10; i++) {
                        if(a%i == 0 && b%i == 0 && c%i == 0) {
                            tmp = 1;
                        }
                    }
                    if(tmp == 0) {
                        System.out.println(a + " " + b + " " + c);
                        for(int i = p; i<1500001; i+=p) {
                            Larray[i]++;
                        }
                    }
                    tmp = 0;
                }
            }
        }
        int sum = 0;
        for(int i = 0; i<1500001; i++) {
            if (Larray[i] == 1) {
                sum++;
            }
        }
        System.out.println(sum);

    }
}