/* 
 The prime 41, can be written as the sum of six consecutive primes:
 
 41 = 2 + 3 + 5 + 7 + 11 + 13
 This is the longest sum of consecutive primes that adds to a prime below one-hundred.
 
 The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.
 
 Which prime, below one-million, can be written as the sum of the most consecutive primes?
 
 
 
 Vår approach var att skapa en relativt kort array med primtal och sedan hitta den längsta sekvensen i arrayen vars summa blir ett primtal.
 Om det visar sig att det finns en möjlighet att med en längre array skapa en längre sekvens än den funna, körs programmet om med tillräckligt lång array.

*/
import java.util.Scanner;
public class P50 {
    
    public static boolean isNP(long N) { //Metod som kontrollerar om ett tal är ett primtal
        if (N == 2) {
            return true;
        } else if (N%2 == 0 || N == 1) {
            return false;
        }
        for (int i = 3; i<=Math.sqrt(N); i+=2) { 
            if(N%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] primtalsArray(long N, int s) { //Metod som skapar en array fylld med primtal, sådana att primtalens summa från ett givet primtal, primtal med index s. 
        
        int array [] = new int[(int) (s + 1000 + N/10000)];
        
        array[1] = 2;
        array[2] = 3;
        boolean isKprime = true;
        
        long sum = 0;
        int counter = 3;

        int k = 5;
        while(true) {            
            isKprime = true;
            for (int i = 3; i<=Math.sqrt(k); i+=2) { 
                if(k%i == 0) {
                    isKprime = false;
                    break;
                }
            }
            if (isKprime) {
                array[counter] = k;
                counter++;
                if (counter > s) {
                    sum += k;
                    if (sum>N) { //Bryter om summan av primtalen som börjar på primtalet med index s överstiger det maximala talet
                        break;
                    }
                }
            }
            k+=2;
        }
        array[0] = counter; //indexet på sista talet + 1 läggs först i arrayen

        return array;
    }
                    
    public static int realmeth(int primarray[], int s, long N) {//Metoden som hittar den längsta sekvensen, där man stoppar in primtalsarrayen, det sista möjliga startprimtalet och den maximala summan.
        int count = 0;
        long max = 0;
        int maxc = 0;
        long prime = 0;
        int maxs = 0;

        for (int start = 1; start<=s; start++) {
            count = 0;
            prime = 0;
            
            while (prime<N) {
                prime += primarray[count+start];
                count++;
                if(count>maxc && prime<N && isNP(prime)) {                    
                    maxc = count;
                    max = prime;
                    maxs = start;
                }
            }
        }
        int k = 0;
        
        while (true) {
            if(N<(max + k*primarray[maxc+maxs])) {
                break;
            }
            k++;
        }
        
        k += maxs;
        if(k <= s) { // kollar om det sista startvärdet var tillräckligt, om inte retuneras k som är det nädvändiga startvärdet, och metoden körs om.
            System.out.println("Sekvensen var: " + maxc + " tal lång. \nSumman av primtalssekvensen blev:\t" +max + "\nPrimtalet sekvensen började på:\t\t" + primarray[maxs]);
            return 0;
        }
        
        return k;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mata in maxtal");
        long N = sc.nextLong();
        double starttime = System.currentTimeMillis();
        
        int s = 20;
        
        int primarray[] = primtalsArray(N,s);
        
        int a = realmeth(primarray, s, N);
        
        if (a>0) {
            int primarray2[] = primtalsArray(N,a);
            int b = realmeth(primarray2, a, N);
        }
        double lasttime = System.currentTimeMillis();
        System.out.println("Tiden programmet tog att köra var:\t" + (lasttime-starttime)/1000 + " sekunder");
    }
}