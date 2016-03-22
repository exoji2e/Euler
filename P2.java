public class P2 extends EulerProblem {
	private int size = 4000000;
	public P2(){
		problemNumber = 2;
	}
	public P2(int size) {
		this.size = size;
	}
	@Override
	public void execute() {
		int j = 2;
		int sum = 0;
		for(int i=1; i<size;) {
			if (j >= size) {
				break;
			}
			
			if (j%2 == 0) {
				sum = sum + j;
			}
			
			if (i%2 == 0) {
				sum = sum + i;
			}
			
			if (j + i > size){
				System.out.print(sum);
			}
			
			if (i<j) {
				i = i + j;
			}
			
			if (j<i) {
				j = j + i;
			}
			
			
		}
	}
	@Override
	protected void input() {
		System.out.print(size);
		
	}
}
