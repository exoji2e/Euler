package notepc;

public class p164 {
	public static int game(int length, int l1, int l2) {
	
		 if(length == 13)
			 return 1;
		 else {
			 int sum = 0;
			 for(int i = 0; i < 10-l1-l2;i++) {
				 sum+= game(length+1, l2, i);
			 }
			 return sum;
		 }
	}
	
	public static void main(String args[]) {
		int sum = 0;
		for(int i = 1; i<=9; i++) {
			sum+= game(1,0,i);
		}
		System.out.println(sum);
	}

}
