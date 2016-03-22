import java.util.Scanner;
public class Problem_53 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hur många rader ska din triangel innehålla?");
        int N = sc.nextInt();
        N++;
        int pascT[][] = new int [N][N];
        for(int i = 0; i<N; i++) {
            pascT[0][i] = 1;
        }
        int Cnt = 0;
        for(int n = 1; n<N; n++) {
            for(int k = 1; k<=n; k++) {
                pascalTri[k][n] = pascalTri[k-1][n-1] + pascalTri[k][n-1];
                if(pascalTri[k][n] > 1000000) {
                    Cnt++;
                    pascalTri[k][n] = 1000001;
                }
            }
        }
        System.out.println(Cnt);
    }
}