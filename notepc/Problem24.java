//
//  Problem24.java
//  
//
//  Created by Måns on 2012-02-23.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//
import java.util.Vector;
public class Problem24 {
	public static void main(String args[]) {
		
		Vector lista = new Vector();
		int count = 0;
		for(int a1 = 0; a1<10; a1++) {
			if (count == 1000000) {
				break;
			}
			for(int a2 = 0; a2<10; a2++) {
				if(a1 != a2) {
					if (count == 1000000) {
						break;
					}
				for(int a3 = 0; a3<10; a3++) {
					if(a1 != a3 && a2 != a3) {
						if (count == 1000000) {
							break;
						}
					for(int a4 = 0; a4<10; a4++) {
						if (count == 1000000) {
							break;
						}
						if(a1 != a4 && a2 != a4 && a3 != a4) {
						for(int a5 = 0; a5<10; a5++) {
							if (count == 1000000) {
								break;
							}
							if(a1 != a5 && a2 != a5 && a3 != a5 && a4 != a5) {
							for(int a6 = 0; a6<10; a6++) {
								if (count == 1000000) {
									break;
								}
								if(a1 != a6 && a2 != a6 && a3 != a6 && a4 != a6 && a5 != a6) {
								for(int a7 = 0; a7<10; a7++) {
									if (count == 1000000) {
										break;
									}
									if(a1 != a7 && a2 != a7 && a3 != a7 && a4 != a7 && a5 != a7 && a6!= a7) {
									for(int a8 = 0; a8<10; a8++) {
										if (count == 1000000) {
											break;
										}
										if(a1 != a8 && a2 != a8 && a3 != a8 && a4 != a8 && a5 != a8 && a6!= a8 && a7 != a8) {

										for(int a9 = 0; a9<10; a9++) {
											if (count == 1000000) {
												break;
											}
											if(a1 != a9 && a2 != a9 && a3 != a9 && a4 != a9 && a5 != a9 && a6!= a9 && a7 != a9 && a8 != a9) {

											for(int a10 = 0; a10<10; a10++) {
												if(a1 != a10 && a2 != a10 && a3 != a10 && a4 != a10 && a5 != a10 && a6!= a10 && a7 != a10 && a8 != a10 && a9 != a10) {
													count = count + 1;
													if (count == 1000000) {
														System.out.println(a1 +" " + a2 + " " + a3 + " " +a4 + " " + a5 + " " + a6 + " " + a7 + " " + a8 + " " + a9 + " " + a10);
														break;
														

													}

													
												}
											}
											}
										}
										}
									}
									}
								}
								}
							}
							}
						}
						}
					}
					}
				}
				}
			}
		}
		System.out.println("klar");
	}
}
