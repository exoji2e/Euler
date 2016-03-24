package notepc;
//
//  Problem_6.java
//  
//
//  Created by Måns on 2012-01-29.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//


import java.util.Scanner;
public class P6 {//extends EulerProblem { soon.
	//problemNumber = 6;
    
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a = 0;
		int b = 0;
		int dif;
		for (int i=1; i<=n; i++) {
			a = a + i*i;
			b = b + i;
		}
		b = b*b;
		System.out.println(a +" "+ b);

		dif = b - a;
		System.out.println(dif);
	}
}
	
		