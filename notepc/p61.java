package notepc;
import java.util.ArrayList;


public class P61 {
	static class CyclicNumbers {
		int sum = 0;
		int [] arrval = new int[9];
		boolean[] arr = new boolean[9];
		int start;
		int end;
		CyclicNumbers(int s, int e, int nbr) {
			sum = nbr;
			start = s;
			end = e;
			arrval[8] = nbr;
			arr[8] = true;
		}
		CyclicNumbers(CyclicNumbers c) {
			this.start = c.start;
			this.end = c.end;
			for(int i = 0; i<9; i++) {
				arr[i] = c.arr[i];
				arrval[i] = c.arrval[i];
			}
			this.sum = c.sum;
		}
		void setStart(int s) {
			start = s;
		}
		void setEnd(int e) {
			end = e;
		}
		int getStart() {
			return start;
		}
		int getEnd() {
			return end;
		}
		boolean isIncluded(int i) {
			return arr[i];
		}
		void setIncluded(int i) {
			arr[i] = true;
		}
		void add2Sum(int i, int val) {
			arrval[i] = val;
			sum+=val;
		}
		int getSum() {
			return sum;
		}
		public String toString() {
			return arrval[3] + " " + arrval[4] + " " + arrval[5] + " " + arrval[6] + " " + arrval[7] + " " + arrval[8] + " " + start + " "+ end + " " + sum;
		}
	}
	
	
	
	static ArrayList<CyclicNumbers> getFitting(CyclicNumbers c, int[][] nbrs, int size[]) {
		ArrayList<CyclicNumbers> cs = new ArrayList<CyclicNumbers>();
		for(int i = 3; i<9; i++) {
			if(!c.isIncluded(i)){
				for(int j = 0; j<size[i]; j++) {
					if(nbrs[i][j]%100 == c.getStart()) {
						CyclicNumbers cnew = new CyclicNumbers(c);
						cnew.setIncluded(i);
						cnew.setStart(nbrs[i][j]/100);
						cnew.add2Sum(i,nbrs[i][j]);
						cs.add(cnew);
						//System.out.println(cs.get(nbradded).getEnd() + " " +cs.get(nbradded).getStart());
					}
					/*if(nbrs[i][j]/100 == c.getEnd()) {
						CyclicNumbers cnew = new CyclicNumbers(c);
						cnew.setIncluded(i);
						cnew.setEnd(nbrs[i][j]%100);
						cnew.add2Sum(i,nbrs[i][j]);
						cs.add(cnew);
						//System.out.println(cs.get(nbradded).getEnd() + " " +cs.get(nbradded).getStart());
					}*/
				}
			}
		}
		return cs;
		
		
	}
	
	public static void main(String args[]) {
		int[][] arr = new int[9][150];
		int[] size = new int[9];
		int nbr = 1;
		int n = 1;
		int nbra = 0;
		while(nbr<10000) {
			if(nbr>=1000)
				arr[3][nbra++] = nbr;
			n++;
			nbr = n*(n+1)/2;	
		}
		size[3] = nbra;
		nbra = 0;
		nbr = 1;
		n = 1;
		while(nbr<10000) {
			if(nbr>=1000)
				arr[4][nbra++] = nbr;
			n++;
			nbr = n*n;	
		}
		size[4] = nbra;
		nbra = 0;
		nbr = 1;
		n = 1;
		while(nbr<10000) {
			if(nbr>=1000)
				arr[5][nbra++] = nbr;
			n++;
			nbr = n*(3*n-1)/2;	
		}
		size[5] = nbra;
		nbra = 0;
		nbr = 1;
		n = 1;
		while(nbr<10000) {
			if(nbr>=1000)
				arr[6][nbra++] = nbr;
			n++;
			nbr = n*(2*n-1);	
		}
		size[6] = nbra;
		nbra = 0;
		nbr = 1;
		n = 1;
		while(nbr<10000) {
			if(nbr>=1000)
				arr[7][nbra++] = nbr;
			n++;
			nbr = n*(5*n-3)/2;	
		}
		size[7] = nbra;
		nbra = 0;
		nbr = 1;
		n = 1;
		while(nbr<10000) {
			if(nbr>=1000)
				arr[8][nbra++] = nbr;
			n++;
			nbr = n*(3*n-2);	
		}
		size[8] = nbra;
		
		ArrayList<CyclicNumbers> list = new ArrayList<CyclicNumbers>();
		for(int i = 0; i<size[8]; i++) {
			list.add(new CyclicNumbers(arr[8][i]/100, arr[8][i]%100, arr[8][i]));
		}
		
		ArrayList<CyclicNumbers> list2 = new ArrayList<CyclicNumbers>();
		for(int i = 0; i<5; i++) {
			if(i%2 == 0) {
				list2 = new ArrayList<CyclicNumbers>();
				for(CyclicNumbers c:list) {
					//System.out.println(i + "     " +c.getSum() + "list2");
					list2.addAll(getFitting(c,arr,size));
				}
			} else {
				list = new ArrayList<CyclicNumbers>();
				for(CyclicNumbers c:list2) {					
					list.addAll(getFitting(c,arr,size));
				}
			}
		}
		for(CyclicNumbers c:list2) {	
			//System.out.println(c.getSum());
			if(c.getStart() == c.getEnd()) {
				System.out.println(c);
			} else {
				//System.out.println(c.getStart() + " "+ c.getEnd());
			}
		}
		
		
		
		
		
		
	}
	
	

}
