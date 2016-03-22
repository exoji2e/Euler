public class P91 {
	public static void main(String args[]) {
		int count = 0;
		int size = 50;
		int xy1 = (size+1)*(size+1)-1;
		for(; xy1>0; xy1--) {
			int xy2 = xy1-1;
			for(;xy2>0; xy2--) {
				int x1 = xy1/(size+1);
				int y1 = xy1%(size+1);
				int x2 = xy2/(size+1);
				int y2 = xy2%(size+1);
				int dx = x1-x2;
				int dy = y1-y2;
				if(!((x1 == 0 && x2 == 0) || (y1 == 0 && y2 == 0))) {
					if((x1*x2 + y1*y2 == 0) || (x1*dx + y1*dy == 0) || (x2*dx + y2*dy == 0)) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}