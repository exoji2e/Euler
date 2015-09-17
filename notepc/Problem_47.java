package notepc;
/*import java.util.Scanner;
public class Problem_47 {
    public static boolean amoutOfPropDiv(int n, int div) {
        int divs = 0;
        while(n%2 == 0) {
            n = n/2;
            divs = 1;
        }
        int savedd = 0;
        for (int d = 3; d<=n; d+=2) {
            if(n%d == 0) {
                n = n/d;
                if(d!= savedd) {
                    divs++;
                    savedd = d;
                }
                d-=2;
            }
            if(div > div) {
                return false;
            }
        }
        if(div == divs) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        System.out.println(amoutOfPropDiv(210,4));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = sc.nextInt();

        int array [] = new int[n/div];
        
        
        int counter = 0;
        for(int i = 10; i<n; i++) {
            if(amoutOfPropDiv(i,div) == true) {
                array[counter] = i;
                counter++;
                System.out.println(i + "true");
            }
        }
        int tmp = 0;
        for(int x = 0; x+3<counter; x++) {
            int a = array[x];
            for(int ds = 1; ds<div; ds++) {
                if (a+ds != array[x+ds]) {
                    tmp = 1;
                    break;
                }
            }
            if(tmp == 0) {
                System.out.println(array[x]);
                break;
            }
            tmp = 0;
        }
        
        
    }
}


*/

import java.util.Scanner;
public class Problem_47 {
    public static boolean amoutOfPropDiv(int n, int div) {
        int divs = 0;
        while(n%2 == 0) {
            n = n/2;
            divs = 1;
        }
        int savedd = 0;
        for (int d = 3; d<=n; d+=2) {
            if(n%d == 0) {
                n = n/d;
                if(d!= savedd) {
                    divs++;
                    savedd = d;
                }
                d-=2;
            }
            if(div > div) {
                return false;
            }
        }
        if(div == divs) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int div = sc.nextInt();
        
        int array [] = new int[div];
        int check;
        int i = 210;
        while(true) {
            if(amoutOfPropDiv(i,div) == true) {

                for(int move = div-1; move>0; move--) {
                    array[move] = array[move-1];
                }
                array[0] = i;
                check = 0;
                for(int test = 1; test<div; test++) {
                    if(array[test]+test != array[0]) {
                        check = 1;
                        break;
                    }
                }
                if(check == 0) {
                    System.out.println(array[div-1]);
                    break;
                }
            }
            i++;
        }
    }
}