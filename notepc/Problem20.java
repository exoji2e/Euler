//
//  Problem20.java
//  
//
//  Created by Måns on 2012-02-16.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//
import java.math.BigInteger;
public class Problem20 {
	public static void main(String args[]) {
		BigInteger produkt = BigInteger.valueOf(1);
		BigInteger tio = BigInteger.valueOf(10);
		BigInteger noll = BigInteger.valueOf(0);
		
		for	(int i = 1; i<=100000; i++) {
			BigInteger p = BigInteger.valueOf(i);
			produkt = produkt.multiply(p);
			while (produkt.mod(tio) == noll) {
				produkt = produkt.divide(tio);
			}
			//System.out.println(produkt);
		}
		String tal = produkt.toString();
		System.out.println(tal);
		int summa = 0;
		for (int i = 0; i<tal.length(); i++) {
			summa = summa + Integer.parseInt(tal.substring(i,i+1));
		}
		System.out.println(summa);
	}

}
