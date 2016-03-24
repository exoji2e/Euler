package notepc;
//
//  Problem_9.java
//  
//
//  Created by Måns on 2012-01-29.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//

public class P9 {
	public static void main(String args[]) {
		for (int a = 1; a<998; a++) {
			for (int b = 1; b<998; b++) {
				int c = 1000-(a+b);
				int ab2 = a*a + b*b;
				int c2 = c*c;
				if (ab2 == c2) {
					System.out.println(a + " " + b + " " + c);
					int produkt = a*b*c;
					System.out.println(produkt);

					
				}
			}
		}
	}
}
