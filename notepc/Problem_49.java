package notepc;
//
//  Problem_49.java
//  
//
//  Created by Måns on 2012-04-21.
//  Copyright 2012 __MyCompanyName__. All rights reserved.
//
import java.util.Scanner;
public class Problem_49 {	
	public static boolean isNPrime(int N){
        if (N%2 == 0) {
            return false;
        }
        for (int i = 3; i<=Math.sqrt(N); i+=2) { 
            if(N%i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int firstPrm(int N){
        String s = "" + N;
        if (s.length() > 1) {
            for(int i = 0; i<s.length()-1;i++) {
                if (Integer.parseInt(s.substring(i,i+1)) > Integer.parseInt(s.substring(i+1,i+2))) {
                    s = s.substring(0,i) + s.substring(i+1,i+2)+ s.substring(i,i+1) + s.substring(i+2,s.length());
                }
            }
            int ny = Integer.parseInt(s.substring(0,s.length()-1));
            s = ""+firstPrm(ny) + s.substring(s.length()-1,s.length());
        }
        int fP = Integer.parseInt(s.substring(0));
        return fP;
    }
    
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Hur många siffror skall talen bestå av?");
        int start = sc.nextInt();
        int slut = (int) (Math.pow(10,start)-1);
        start = (int) (Math.pow(10,start-1));
        System.out.println("Mata in differans");
        int diff = sc.nextInt();
        System.out.println("Mata in antal termer");
        int nt = sc.nextInt();
        
        if ((nt-1)*diff + start < slut && nt>1) {
        
            int tester;
        
            for (int i = start; i < slut-diff*(nt-1); i++) {
                tester = 0;
            
                for (int j = 0; j<nt; j++) {
                    if (isNPrime(i+j*diff) == false) {
                        tester = 1;
                        break;
                    }
                    if (firstPrm(i) != firstPrm(i+j*diff)) {
                        tester = 1;
                        break;
                    }
                }
                if(tester == 0){
                    for (int j = 0; j<nt; j++) {
                        System.out.print(i+j*diff+ " , ");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println("Klar");
    }
}