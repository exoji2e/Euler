public class P14 extends EulerProblem{
	private int n = 1000000;
	public P14() {
		problemNumber = 14;
	}
	public P14(int n) {
		problemNumber = 14;
		this.n = n;
	}
	
	private long nextNumber(long a) {
		if (a%2 == 0) {
			a = a/2;
		}
		else if (a>1){
			a = 3*a + 1;
		}
		return a;
	}
	
	@Override
	public void execute() {
		int b=0;
		int c=1;
		for(int i = 2; i<=n; i++) {
			long a = i;
			int op = 1;
			
			while(a>1) {
				a = nextNumber(a);
				
				//System.out.println(a);
				op = op + 1;
				if (a == 1) {
					//System.out.println(m + " " + c + " " + a);
					if (op > b){
						b = op;
						c = i;
						//System.out.println(b + " " + c + " ");
					}
					break;
				}
			}
		}
		System.out.print(c);
	}
	@Override
	protected void input() {
		System.out.print(n);
		
	}
}
