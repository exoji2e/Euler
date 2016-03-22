import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Problem_89 {
    
    public static int charVal(char c) {
        if(c == 'M') {
            return 1000;
        } else if(c == 'D') {
            return 500;
        } else if(c == 'C') {
            return 100;
        } else if(c == 'L') {
            return 50;
        } else if(c == 'X') {
            return 10;
        } else if(c == 'V') {
            return 5;
        } else if(c == 'I') {
            return 1;
        }else {
            return 0;
        }
    }
    
    public static int reader(String s) {
        
        int val = 0;
        
        for(int i = 0; i<s.length()-1; i++) {
            if(charVal(s.charAt(i)) < charVal(s.charAt(i+1)))
                val -= charVal(s.charAt(i));
            else
                val += charVal(s.charAt(i));
        }
        val += charVal(s.charAt(s.length()-1));
        
        return val;
        
    }
    
    
    public static int writer (int n) {
        int nbrofd = 0;
        nbrofd += n/1000;
        n = n%1000;
        if(n >= 900) {
            nbrofd += 2;
            n -= 900;
        }
        if(n>= 500) {
            nbrofd++;
            n-=500;
        }
        if(n>=400) {
            nbrofd+=2;
            n-=400;
        }
        nbrofd += n/100;
        n = n%100;
        if(n>= 90) {
            nbrofd+=2;
            n-=90;
        }
        if(n>= 50) {
            nbrofd++;
            n-=50;
        }
        if(n>=40) {
            nbrofd+=2;
            n-=40;
        }
        nbrofd += n/10;
        n = n%10;
        if(n>= 9) {
            nbrofd+=2;
            n-=9;
        }
        if(n>= 5) {
            nbrofd++;
            n-=5;
        }
        if(n>=4) {
            nbrofd+=2;
            n-=4;
        }
        nbrofd += n;
        return nbrofd;
    }
    public static void main(String args[]) throws IOException {
        Scanner input = new Scanner(new File("roman.txt"));
        int saved = 0;
        while(input.hasNext()) {
            String s = input.nextLine();
            saved += s.length() - writer(reader(s));
        }
        System.out.println(saved);
    }
}