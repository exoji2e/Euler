//
//  Problem23.java
//  
//
//  Created by Måns on 2012-02-23.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//
import java.util.Vector;

public class Problem23 {
		public static int getDivisorSum(int n) {
			int a = 0;
			for(int i = 1; i<n; i++) {
				if (n%i == 0) {
					a = a + i;
				}
			}
			return a;
		}

	public static void main(String args[]) {
		int sum = 0;
		Vector Listofadnum = new Vector();
		for (int i = 1; i<28123; i++) {
			int a = getDivisorSum(i);
			if (a>i) {
				Listofadnum.add(i);
			}
		}
		System.out.println("klar med att skapa vectorn");
		for (int x = 1; x<28123; x++) {
			int kontroll = 0;
			for (int i = 0; i<=Listofadnum.size(); i++) {
				Integer ii = (Integer) (Listofadnum.elementAt(i));
				if (ii+12>x) {
					break;
				}
				for (int j = 0; j<=Listofadnum.size(); j++) {
					Integer ji = (Integer) (Listofadnum.elementAt(j));
					if (ji + ii > x) {
						break;
					}
					if (ji+ii == x) {
						kontroll = 1;
						System.out.println(x);
						break;
					}
				}
				if (kontroll == 1) {
					break;
				}
			}
			if (kontroll == 0) {
				sum = sum + x;
				//System.out.println(x);
			}
		}
		System.out.println(sum);
	}
}
