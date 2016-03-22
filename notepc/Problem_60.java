public class Problem_60 {
    
    public static boolean check2Primes(int a, int b) {
        boolean ret = true;
        if(!isPrime(Long.parseLong("" + a + "" +b))) {
            ret = false;
        }
        if(!isPrime(Long.parseLong("" + b + "" +a))) {
            ret = false;
        }
        return ret;
    }
    
    public static boolean isPrime(long n) {
        if (n == 2) {
            return true;
        }
            
        if (n%2 == 0) {
            return false;
        }
        for (int i = 3; i<=Math.sqrt(n); i+=2) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]) {
        int a = 26034;
        int lastprint = 0;
        for(int i1 = 11; 5*i1<a; i1+=2) {
            if(i1%3 == 2 && isPrime(i1)) {
                for(int i2 = i1+2; (i1+i2*4<a); i2+=2) {
                    if(i2%3 == 2 && isPrime(i2) && check2Primes(i1,i2)) {
                        for(int i3 = i2+2; i1+i2+3*i3<a; i3+=2) {
                            if(i3%3 == 2 && isPrime(i3) && check2Primes(i1,i3) && check2Primes(i2,i3)) {
                                for(int i4 = i3+2; i1+i2+i3+2*i4<a; i4+=2) {
                                    if(i4%3 == 2 && isPrime(i4) && check2Primes(i1,i4) && check2Primes(i2,i4) && check2Primes(i3,i4)) {
                                        for(int i5 = i4+2; i1+i2+i3+i4+i5<a; i5+=2) {
                                            if(i5%3 == 2 && isPrime(i4) && check2Primes(i1,i5) && check2Primes(i2,i5) && check2Primes(i3,i5) && check2Primes(i4,i5)) {
                                                System.out.println("SVAR2mod3! " + (i1+i2+i3+i4+i5) +  " " + i1+ " " + i2 + " " + i3 + " " + i4);
                                            }
                                        }
                                    }
                                }
                                
                            }
                        }
                    }
                }
            }
            if(i1 > lastprint+100) {
                //System.out.println("2mod3" + i1);
                lastprint = i1;
            }
            
        }
        lastprint = 0;
        for(int i1 = 7; 5*i1<a; i1+=2) {
            if(i1%3 == 1 && isPrime(i1)) {
                for(int i2 = i1+2; (i1+i2*4<a); i2+=2) {
                    if(i2%3 == 1 && isPrime(i2) && check2Primes(i1,i2)) {
                        for(int i3 = i2+2; i1+i2+3*i3<a; i3+=2) {
                            if(i3%3 == 1 && isPrime(i3) && check2Primes(i1,i3) && check2Primes(i2,i3)) {
                                for(int i4 = i3+2; i1+i2+i3+2*i4<a; i4+=2) {
                                    if(i4%3 == 1 && isPrime(i4) && check2Primes(i1,i4) && check2Primes(i2,i4) && check2Primes(i3,i4)) {
                                        for(int i5 = i4+2; i1+i2+i3+i4+i5<a; i5+=2) {
                                            if(i5%3 == 1 && isPrime(i4) && check2Primes(i1,i5) && check2Primes(i2,i5) && check2Primes(i3,i5) && check2Primes(i4,i5)) {
                                                System.out.println("SVAR1mod3! " + (i1+i2+i3+i4+i5) +  " " + i1+ " " + i2 + " " + i3 + " " + i4);
                                            }
                                        }
                                    }
                                }
                                
                            }
                        }
                    }
                }
            }
            if(i1 > lastprint+100) {
                //System.out.println("2mod3" + i1);
                lastprint = i1;
            }
            
        }
    
               
   
    }
}