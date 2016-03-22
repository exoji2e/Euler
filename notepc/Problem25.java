//
//  Problem25.java
//  
//
//  Created by Måns on 2012-02-23.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//
import java.math.BigInteger;
public class Problem25 {
	public static void main(String args[]) {
		BigInteger F1 = BigInteger.valueOf(1);
		BigInteger F2 = BigInteger.valueOf(2);
		BigInteger tio = BigInteger.valueOf(10);
		BigInteger max = tio.pow(999);
		int count = 3;
		
		while (max.compareTo(F1)==1 && max.compareTo(F2)==1) {
			if (F1.compareTo(F2)==-1) {
				F1 = F1.add(F2);
				count = count + 1;
			}
			else if (F1.compareTo(F2)==1) {
				F2 = F1.add(F2);
				count = count + 1;
			}
		}
		System.out.println(count);
		 
	}
}
