package notepc;
//
//  Problem_16.java
//  
//
//  Created by Måns on 2012-01-30.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//
import java.math.BigInteger;

public class Problem_16 {
	public static void main(String args[]) {
		
        BigInteger n = BigInteger.valueOf(1000);
        BigInteger b = BigInteger.valueOf(2);
		BigInteger c = BigInteger.valueOf(2);

		for (int i = 2; i<=1000; i++) {
			b = b.multiply(c);
		}
		
		
		System.out.println(b);
		String a = "";
		a = b.toString();
		int sum = 0;
		for (int i=0; i<a.length(); i++) {
			sum = sum + Integer.parseInt(a.substring(i,i+1));
			System.out.println(sum);
		}
	}

}
