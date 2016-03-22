//
//  Problem_50_test.java
//  
//
//  Created by Måns on 2012-04-21.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//
import java.util.Scanner;
public class Problem_50_test {	
	/*public static int antalPrimtal(int N){
        int count = 2;
        int a = 0;
        
        for (int k = 5; k<=N; k+=2) {
            if (k%2 != 0) {
                a = 0;
                for (int i = 3; i<=Math.sqrt(k); i+=2) { 
                    
                    if(k%i == 0) {
                        a++;
                        break;
                    }
                }
                if (a == 0) {
                    count++;
                }
            }
        }
        return count;
    }*/
    
    public static int[] primtalsArray(int N){
        int count = N/1000 + 20000;
        int primtal [] = new int [count];
        primtal[1] = 2;
        primtal[2] = 3;
        int counter = 3;
        int a = 0;
        
        for (int k = 5; k<=N; k+=2) {
            if (k%2 != 0) {
                a = 0;

                for (int i = 3; i<=Math.sqrt(k); i+=2) { 
                    if(k%i == 0) {
                        a++;
                        break;
                    }
                }
                if (a == 0) {
                    primtal [counter] = k;
                    counter++;
                }
            }
        }
        primtal[0] = counter;
        return primtal;
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Mata in maxvärde");

        int N = sc.nextInt();
		                
        int arraymaxind = N/4 + 10;
        
        int primtal[] = primtalsArray(N);

        System.out.println(primtal[0]);

        System.out.println("Klar med array");
    
        
        int max=0;
        int count=0;
        int equal=0;
        int prime;
        int primest = 0;
        int bb = 0;
        
        
        for(int d = primtal[0]; d>0; d--) {
            prime = primtal[d];
            
            if (primest > prime) {
                break;
            }

            
            for(int c = 1; c<arraymaxind; c++) {
                if((count+1)*primtal[c] > prime) {
                    break;
                }
                //ccount = count;
                for(int b = 1; b<arraymaxind; b++) {
                    bb=b;
                    equal += primtal[b+c];
                    if(equal == prime && b>count) {
                        max = equal;
                        count = b;
                        System.out.println(count + " " + max +" " + c);
                        primest = 0;

                        for(int i = 1; i<=count; i++) {
                            primest += primtal[i];
                        }
                        
                        break;
                        
                    }
                    if(equal>prime) {
                        break;
                    }
                }
                if(equal > prime && bb<count) {
                    equal = 0;
                    break;
                }
                equal = 0;
            }
        }
        System.out.println(max); 
	}
}
