package notepc;
//
//  Problem_48.java
//  
//
//  Created by Måns on 2012-04-21.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//
import java.math.BigInteger;
import java.util.Scanner;

public class Problem_48 {
	public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
		
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(0);
        BigInteger c = BigInteger.valueOf(0);
        String s ="";
        long ten=0;
		for (int i = 1; i<=n; i++) {
            if(i%10 != 0 || i<11) {
                b = BigInteger.valueOf(i);
                c = b.pow(i);
                sum = sum.add(c);
                s = sum.toString();
                if (i > 20) {
                    int x = s.length();
                    int y = x-10;

                    ten = Long.parseLong(s.substring(y,x));
                    sum = BigInteger.valueOf(ten);
                }
            }
		}
        System.out.println(sum);
    }
}
