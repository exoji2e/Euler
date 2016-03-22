//
//  Problem17.java
//  
//
//  Created by Måns on 2012-02-16.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//

public class Problem17 {
	
	public static int lenghtConvertEntal(int n) {
		switch (n) {
			case 0: 
				n = 0;
				break;
			case 1:
				n = 3;
				break;
			case 2:
				n = 3;
				break;
			case 3:
				n = 5;
				break;
			case 4:
				n = 4;
				break;
			case 5:
				n = 4;
				break;
			case 6:
				n = 3;
				break;
			case 7:
				n = 5;
				break;
			case 8:
				n = 5;
				break;
			case 9:
				n = 4;
				break;
			case 10:
				n = 3;
				break;
			case 11:
				n = 6;
				break;
			case 12:
				n = 6;
				break;
			case 13:
				n = 8;
				break;
			case 14:
				n = 8;
				break;
			case 15:
				n = 7;
				break;
			case 16:
				n = 7;
				break;
			case 17:
				n = 9;
				break;
			case 18:
				n = 8;
				break;
			case 19:
				n = 8;
				break;
			case 20:
				n = 6;
				break;
		}
		return n;
	}
	
	public static int lenghtConvertTiotal(int n) {
		switch (n) {
			case 0: 
				n = 0;
				break;
			case 1:
				n = 0;
				break;
			case 2:
				n = 6;
				break;
			case 3:
				n = 6;
				break;
			case 4:
				n = 5;
				break;
			case 5:
				n = 5;
				break;
			case 6:
				n = 5;
				break;
			case 7:
				n = 7;
				break;
			case 8:
				n = 6;
				break;
			case 9:
				n = 6;
				break;
		}
		return n;
	}
	
			
	public static void main(String args[]) {
		int sum = 0;
		int b;
		int c;
		int d;
		for (int i = 1; i <= 1000; i++) {
			b = i;
			c = 0;
			d = 0;
			
			if(b%100 != 0) {
				d = (b - b%100)/100;
				b = b%100;
			}
			
			else if(b%100 == 0) {
				d = b/100;
				b = 0;
			}
			
			if(b > 20) {
				c = (b - b%10)/10;
				b = b%10;
			}
			
			b = lenghtConvertEntal(b);
			
			c = lenghtConvertTiotal(c);
			if (d!=0) {
				if (d < 10) {
					d = lenghtConvertEntal(d) + 7;
					if (b>0 || c>0) {
						d = d+3;
					}
				}
				else {
					d = 11;
				}
			}
			sum = sum + b + c + d;
		}
		System.out.println(sum);
	}
			

}
