public class Problem_97 {
    public static void main(String args[]) {
        long number = 28433;
        String s = "";
        for(int i = 1; i<=7830457;i++) {
            number *= 2;
            
            if(number>Math.pow(10,10)) {
                s = "" + number;
                number = Long.parseLong(s.substring(1));
            }
            
        }
        number++;
        
        System.out.println(number);
    }
}