//
//  Problem29.java
//  
//
//  Created by Måns on 2012-02-29.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//

import java.util.Scanner;
public class Problem29 {
	public static boolean rootOf(int i, int power, int b, int j) {
		
		double rk = (double) (i);
		
		for (double n = 2; n<=i; n++) {
			
			for (double x = 2; x<= 100; x++) {

				double a = 1/x;
				double d = Math.pow(rk,a);
			
				if (d==n ) {
					if(x*j <= b) {
						return true;
					}
					for (int s = 2; s<x; s++) {
						if(Math.pow(d,s)<=100 && x*j/s < 100) {
							System.out.println("funkar");
							return true;
						}
					}
				
		
		/*for(int divisor = 2; divisor<= Math.sqrt(i); divisor++) {
			for(int powerd = 1; powerd<=power; powerd++) {
				if(i/Math.pow(divisor,powerd) == divisor && powerd*j <= b) {
					System.out.println(i + " " + j + " "+ divisor + " " + powerd*j);
					return true;
					*/
				}
			}
		
		}
		return false;
	}
		
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a = ?");
		int a = sc.nextInt();
		System.out.println("b = ?");
		int b = sc.nextInt();
		
		int count = 0;
		int power = 6;

		for (int i = 2; i<=a; i++) {
			for (int j = 2; j<=b; j++) {
				count++;
				if (rootOf(i,power,b,j) == true) {
					count--;
				}
				
			}
		}
		System.out.println(count);
				
	}

				
		
		
		
		

}
