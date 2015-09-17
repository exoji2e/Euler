package notepc;
public class Problem_43 {
    static String array[] = new String [3628800];
    static int counter = 0;

    
    public static void permute(String beginningString, String endingString, int max) {
        if (counter == max) {
            return;
        }
        if (endingString.length() <= 1) {
            array[counter] = "" + beginningString + endingString;
            counter++;
            
        } else {
            for (int i = 0; i < endingString.length(); i++) {
                try {
                    String newString = endingString.substring(0, i) + endingString.substring(i + 1);
                    
                    permute(beginningString + endingString.charAt(i), newString, max);
                } catch (StringIndexOutOfBoundsException exception) {
                    exception.printStackTrace();
                }
            }
        }
        
        return;
    }
    
    public static boolean isPandigital(String s) {
        if(Integer.parseInt(s.substring(1,4))%2 == 0 &&
           Integer.parseInt(s.substring(2,5))%3 == 0 &&
           Integer.parseInt(s.substring(3,6))%5 == 0 &&
           Integer.parseInt(s.substring(4,7))%7 == 0 &&
           Integer.parseInt(s.substring(5,8))%11 == 0 &&
           Integer.parseInt(s.substring(6,9))%13 == 0 &&
           Integer.parseInt(s.substring(7,10))%17 == 0) {
            return true;
        }
        return false;

           
    }
    
    public static void main(String args[]) {
        permute("", "0123456789", 3628800);
        System.out.println("klar med array");

        long sum = 0;
        for(int i = 0; i<3628800; i++) {
            if(isPandigital(array[i]) == true) {
                System.out.println(array[i]);
                sum += Long.parseLong(array[i].substring(0));
            }else{
                //System.out.println(array[i] + " - false");
            }
        }
        System.out.println(sum);
        
        
    }
}