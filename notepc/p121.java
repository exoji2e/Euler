package notepc;

public class p121 {
	
	public static double game(int i, int l, double p) {
		if (l > 7)
			return 0;
		else if(i == 15 && l == 7)
			return p/16;
		else if(i == 15) 
			return p;
		else 
			return game(i+1,l,p/(i+1)) + game(i+1,l+1,p - p/(i+1));
	}
	
	public static void main(String args[]) {
		
		double b = game(1,0,1);
		
		System.out.println((int) (1.0/b));
		
	}

}
