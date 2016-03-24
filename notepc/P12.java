package notepc;
//
//  Problem_12.java
//  
//
//  Created by Måns on 2012-01-24.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//

import java.util.Scanner;
public class P12 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int divisors = scan.nextInt();
		int a;
		int n;
		for (int i = 1; i*(i+1)/2<=2147483647; i++) {
			n = i*(i+1)/2;
			a = 1;
			for (int j = 2; j<=Math.sqrt(n); j++) {
				if (j == Math.sqrt(n))
                    a--;
                if (n%j == 0)
					a +=2;
			}
			if (a >= divisors) {
				System.out.println(n);
				break;
			}
		}
	}
}