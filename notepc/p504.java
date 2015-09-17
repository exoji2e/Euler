package notepc;

public class p504 {
	public static void main(String[] args) {
		int size = 100;
		int dots[][] = new int[size + 1][size + 1];
		
		for(int i = 1; i<=size; i++) {
			for(int j = 1; j<=size; j++) {
				int b;
				if(j<i) {
					b = (i+j+gcd(i,j));
				} else {
					b = (i+j+gcd(j,i));
				}
				dots[i][j] = i*j/2 - b/2 + 1;
			}
		}
		int counter = 0;
		for(int a = 1; a<=size; a++) {
			for(int b = 1; b<=size; b++) {
				for(int c = 1; c<=size; c++) {
					for(int d = 1; d<=size; d++) {
						int sq = dots[a][b] + dots[b][c] + dots[c][d] + dots[a][d] + a + b + c + d - 3;
						int root = (int) Math.sqrt(sq);
						if (root*root == sq) {
							counter++;
						}
					}
				}
			}
		}
		System.out.println(counter);
	}
	
	public static int gcd(int n, int m) {
		if(n%m == 0) {
			return m;
		} else {
			return gcd(m,n%m);
		}
	}
}
