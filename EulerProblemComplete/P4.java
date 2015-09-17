
public class P4 extends EulerProblem {
	
	public P4(){
		problemNumber = 4;
	}
	@Override
	protected void execute() {
		
		int a=9;
		int pallindrome = 0;
		int sum;
		for (int i=0; i<=a;i++) {
			for (int j=0; j<=a;j++) {
				for (int k=0; k<=a;k++) {
					sum = 100001*i + 10010*j + 1100*k;
					if (sum>pallindrome) {
						for(int l=999; l>99; l--) {
							if(sum/l<1000) {
								if (sum%l == 0){
									pallindrome = sum;
									break;
								}
							}
						}
					}
				}
			}
		}
		System.out.print(pallindrome);
	
		
	}

	@Override
	protected void input() {
		System.out.print("6 digits");
		
	}
}
