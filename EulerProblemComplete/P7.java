import java.util.ArrayList;
public class P7 extends EulerProblem{
	private int n = 10001;
	public P7() {
		problemNumber = 7;
	}
	public P7(int n) {
		problemNumber = 7;
		this.n = n;
	}
		
	public void execute() {	
		ArrayList<Integer> list = primeListOfN(n);
		System.out.print(list.get(n-1));
	}

	@Override
	protected void input() {
		System.out.print(n);
		
	}
}