import java.math.BigInteger;
public class Problem_104 {
    public static String firstPrm(String s){
        if (s.length() > 1) {
            for(int i = 0; i<s.length()-1;i++) {
                if (charAt(i) > (charAt(i+1)) {
                    s = s.substring(0,i) + s.substring(i+1,i+2)+ s.substring(i,i+1) + s.substring(i+2,s.length());
                }
            }
            String ny = "" + s.substring(0,s.length()-1);
            s = ""+firstPrm(ny) + s.substring(s.length()-1,s.length());
        }
        return s;
    }

    public static void main(String args[]) {
    
        BigInteger Fn = BigInteger.valueOf(1);
        BigInteger Fn1 = BigInteger.valueOf(1);
        BigInteger lastb;
        int counter = 2;
        String first;
        String last;
        String Fns;
        
        BigInteger moder = new BigInteger("1000000000");
        
        
        
        while(true) {
            if(counter%2 == 0) {
                Fn = Fn.add(Fn1);
            } else {
                Fn1 = Fn.add(Fn1);
            }
            counter++;

            
            if(counter > 67000) {
                if(counter%2 == 0) {
                    lastb = Fn1.mod(moder);
                    //Fns = Fn1.toString();
                }else {
                    lastb = Fn.mod(moder);

                    //Fns = Fn.toString();

                }
                //last = Fns.substring(Fns.length()-9,Fns.length());
                last = "" + lastb;
                if(firstPrm(last).equals("123456789")) {
                    System.out.println(counter + "last works");
                    if(counter%2 == 0) {
                        Fns = Fn1.toString();
                    }else {
                        
                        Fns = Fn.toString();
                        
                    }
                    first = Fns.substring(0,9);
                    if(firstPrm(first).equals("123456789")) {
                        System.out.println(counter + "first works");
                        break;
                    }


                }
                
            }
            
            
            
        }
        
        
        
        
    
    }
}