package notepc;
public class p205 {
	public static void main(String args[]) {
		
		int p [][] = new int [37][11];
		int c [][] = new int [37][8];
		c[0][0] = 1;
		p[0][0] = 1;
		
		for(int i = 0; i<9; i++) {
			for(int n = 1; n<=4; n++) {
				for(int j = i; j<=i*4; j++) {
					p[j+n][i+1] += p[j][i];
				}
			}
		}
		for(int i = 0; i<6; i++) {
			for(int n = 1; n<=6; n++) {
				for(int j = i; j<=i*6; j++) {
					c[j+n][i+1] += c[j][i];
				}
			}
		}

		for(int i = 1; i<37; i++) {
			c[i][7] = c[i-1][7] + c[i][6];
			p[i][10] = p[i-1][10] + p[i][9];
		}
		
		double sann = 0;
		for(int i = 1; i<37; i++) {
			sann += (p[i][9])*c[i-1][7]/(1.0*c[36][7]);
		}
		sann = sann/(1.0*p[36][10]);
		System.out.println(sann);
	}
}
