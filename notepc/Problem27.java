//
//  Problem27.java
//  
//
//  Created by Måns on 2012-02-24.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//

public class Problem27 {
	public static boolean prime(int x) {
		for(int i = 2; i<=Math.sqrt(x); i++) {
			if (x%i == 0) {
				return false;
			}
		}
		if (x < 0) {
			return false;
		}
		return true;
	}
		
		
	public static void main(String args[]) {
		int count = 0;
		int staticcount = 0;
		int statica = 0;
		int staticb = 0;
		
		for (int a = -1000; a<=1000; a++) {
			
			for (int b= -1000; b<=1000; b++) {
				count = 0;
				for (int n = 0; n < 500; n++) {
					int x = n*n + a*n + b;
					
					if (prime(x) == true) {
						count++;
						//System.out.println(a + " " + b + " " + count);
						if (count > staticcount) {
							staticcount = count;
							statica = a;
							staticb = b;
							System.out.println(a + " " + b + " " + count);							
							
						}
						
					}
					if (prime(x) == false) {
						count = 0;
						break;
					}
				}
			}
		}
		int svar = statica * staticb;
		System.out.println(svar + " " + staticcount);
	}
					
}
