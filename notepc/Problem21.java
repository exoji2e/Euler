//
//  Problem21.java
//  
//
//  Created by Måns on 2012-02-22.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//

public class Problem21 {
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
		int x = 10000;
		int totalSum = 0;
		for (int t = 1; t<x; t++) {
			int td = getDivisorSum(t);
			if (getDivisorSum(td) == t && td!=t) {
				totalSum = totalSum + t;
				//System.out.println(t);

			}
		}
		System.out.println(totalSum);
		System.out.println(getDivisorSum(8128));

	}	

}
