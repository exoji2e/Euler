
public abstract class EulerProblem extends EulerFunctionCollector{
	protected int problemNumber;
	protected abstract void execute();
	protected abstract void input();
	public void run() {
		long time = System.currentTimeMillis();
		System.out.print(problemNumber + "\t");
		execute();
		System.out.print("\t");
		input();
		System.out.print("\t" + (System.currentTimeMillis()-time));
		System.out.println();
	}
	
}
