//
//  Problem_50.java
//  
//
//  Created by Måns on 2012-04-21.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//
import java.util.Vector;
import java.util.Scanner;
public class Problem_50 {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Mata in maxtal");

		int N = sc.nextInt();
        double starttime = System.currentTimeMillis();

		
		Vector primtal = new Vector();
		primtal.add(2);
		primtal.add(3);
		primtal.add(5);
		primtal.add(7);
		primtal.add(11);
		primtal.add(13);
		primtal.add(17);
		primtal.add(19);
		primtal.add(23);
        
		
		int z;
		int y;
		
		for(int i = 29; i<=N; i+=2) {
			z = 0;
			y = (int) (primtal.size()/5 +1);
            
			for (int a = 1; a < y; a++) {
				Integer x = (Integer) (primtal.elementAt(a));
				
				if (i%x == 0) {
					z = 1;
					break;
				}
			}
			
			if (z == 0) {
				primtal.add(i);
			}
		}
        //System.out.println("Klar med vector");
        
        int max=0;
        int count=0;
        int equal=0;
        int prime;
        int ccount = 0;
        Integer dryg;
        int drygare;
        
        
        for(int a = primtal.size()*98/100; a<primtal.size()-1; a++) {
            dryg = (Integer)(primtal.get(a));
            drygare = (int) (dryg);
            prime = drygare;
            
            for(int c = 0; c<primtal.size()-primtal.size()/20-1; c++) {
                ccount = count;
                for(int b = 0; b<prime/20; b++) {
                    dryg = (Integer)(primtal.get(b+c));
                    drygare = (int) (dryg);
                    
                    equal = equal + drygare;
                    if(equal == prime && b>count) {
                        max = equal;
                        count = b;
                        //System.out.println(count + " " + max);
                        break;
                    }
                    if(equal>prime) {
                        break;
                    }
                }
                equal = 0;
                if(count != ccount) {
                    break;
                }
            }
            
        }
        System.out.println("Sekvensen var: " + count + " tal lång. Summan av primtalssekvensen blev: " +max);
        double lasttime = System.currentTimeMillis();
        System.out.println("Tiden programmet tog att köra: " + (lasttime-starttime)/1000 + " sekunder");
    }
}