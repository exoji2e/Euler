public class P1 extends EulerProblem {
	private int size = 1000;
	public P1 (){
		problemNumber = 1;
	}
	public P1(int size) {
		this.size = size;
		problemNumber = 1;
	}

	@Override
	protected void execute() {
		int sum = 0;
		for(int i=1;i<size;i++) {
			if (i%3 == 0) {
				sum = sum + i;
			}
			
			else if (i%5 == 0) {
				sum = sum + i;
			}
		}
		System.out.print(sum);
		
	}
	@Override
	protected void input() {
		System.out.print(size);
		
	}
}
