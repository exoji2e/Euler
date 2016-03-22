//
//  Problem31.java
//  
//
//  Created by Måns on 2012-02-25.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//

public class Problem31 {
	public static void main(String args[]) {
		int count = 1;
		
		for(int P1  = 0; P1<=2; P1++) {
			if(P1*100 > 200) {
				break;
			}
			for(int p50 = 0; p50<=4; p50++) {
				if(P1*100 + p50*50 > 200) {
					break;
				}
				for(int p20 = 0; p20<=10; p20++) {
					if(P1*100 + p50*50 + p20*20 > 200) {
						break;
					}				
					for(int p10 = 0; p10<=20; p10++) {
						if(P1*100 + p50*50 + p20*20 + p10*10 > 200) {
							break;
						}
						for(int p5 = 0; p5<=40; p5++) {
							if(P1*100 + p50*50 + p20*20 + p10*10 + p5*5 > 200) {
								break;
							}
							for(int p2 = 0; p2<=100; p2++) {
								if(P1*100 + p50*50 + p20*20 + p10*10 + p5*5 + p2*2 > 200) {
									break;
								}
								for(int p1 = 0; p1<=200; p1++) {
									int x = P1*100 + p50*50 + p20*20 + p10*10 + p5*5 + p2*2 + p1;
									if(x > 200) {
										break;
									}
									if(x == 200) {
										count++;
										break;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}		
}
