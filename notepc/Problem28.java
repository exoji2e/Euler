//
//  Problem28.java
//  
//
//  Created by Måns on 2012-02-24.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//

public class Problem28 {
	public static void main(String args[]) {
		int sum = 0;
		for(int n = 3; n<= 1001; n = n+2) {
			sum = sum + 4*((n-2)*(n-2)) + 10*(n-1);
		}
		System.out.println(sum);
	}

}
