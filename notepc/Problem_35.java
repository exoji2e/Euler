package notepc;
public class Problem_35 {
public static int[] permutations(int n) {

    String s = "" + n;
    int count = 0;
    
    int arrinput;
    
    int l = s.length();
    int array[] = new int [l];
    
    for (int i = 0; i<l; i++) {
        s =""+ s.substring(1,l) + s.charAt(0);
        arrinput = Integer.parseInt(s.substring(0,l));
        array[i] = arrinput;
    }
    
    return array;

}

    public static boolean isNPrime(int N){
        if (N == 2) {
            return true;
        }
        
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


    public static void main(String args[]) {
        int count = 0;
        int kont = 0;
        String s;
        for (int i = 2; i<1000000; i++) {
            if(isNPrime(i) == true) {
                int array[] = permutations(i);
                kont = 0;
                s=""+i;
                for (int k = 0; k<s.length(); k++) {
                    if(isNPrime(array[k]) == false) {
                        kont = 1;
                        break;
                    }
                }
                if(kont == 0) {
                    System.out.println(i);

                    count++;
                }
            }

        }
        System.out.println(count);
    }
}





