public class P3 extends EulerProblem{
	long prime = 600851475143L;
	public P3 () {
		problemNumber = 3;
	}
	public P3 (long prime) {
		problemNumber = 3;
		this.prime = prime;
	}
	@Override
	public void execute() {
		long n = prime;
        while (n%2 == 0) {
        n = n/2;
        }
		for(long i=3;i<=Math.sqrt(n);i+=2){
			if (n%i==0) {
				n=n/i;
				i-=2;
			}
		}
		System.out.print(n);
	}
	@Override
	protected void input() {
		System.out.print(prime);	
	}
}
				

