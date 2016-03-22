public class P33 extends EulerProblem {
	public P33() {
		problemNumber = 33;
	}
    @Override
    protected void execute() {
        int productn = 1;
        int productd = 1;
        for (double i = 11; i<99; i++) {
            for (double j = i+1; j<100; j++) {
                if (j%10 != 0 && j%11 != 0) {


                    double idj = i/j;
                
                    String is = "" + i;
                    String js = "" + j;
                    
                    if(Integer.parseInt(is.substring(1,2)) == Integer.parseInt(js.substring(0,1))) {
                        double hi = Double.parseDouble(is.substring(0,1));
                        double hj = Double.parseDouble(js.substring(1,2));
                    
                        double hidhj = hi/hj;
                        if ( idj == hidhj) {
                            int ii = (int) (i);
                            int ij = (int) (j);

                            //System.out.println(i + " , " +j + " , " + gcd(ij,ii));
                            productn *= ii;
                            productd *= ij;
                        }
                    }
                }
            }
        }
        System.out.print(productd/gcd(productd,productn));
    }

    @Override
    protected void input() {
    	System.out.print("2 digits");
	
    }
}