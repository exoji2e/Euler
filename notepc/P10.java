package notepc;
//
//  Problem_10.java
//  
//
//  Created by Måns on 2012-01-29.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//


import java.util.Scanner;
public class P10 {
		
		
		
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Skriv ditt tal");
		double m = scan.nextLong();
		double sum = 0;

		for(double n = 2; n<=m; n++) {
		
			double sn = Math.sqrt(n);
		
			int a = 0;
		
			for (double i = 2; i <= sn; i++) {
				double x = n/i;
				int y = (int) (n/i);
			
				if (x == y){
					a = a + 1;
					break;
				}
			}
			if (a == 0){
				sum = sum + n;
			}
		}
		System.out.println(sum);
	}
}