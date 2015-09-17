package notepc;
import java.util.Vector;

public class Problem_32 {
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
        Vector v = new Vector();
        v.add(7254);
        String s = "";
        int kontroll = 0;
        int trying;
        for(int i = 1; i<100; i++) {
            for(int j = 100; j<9999; j++) {
                
                if(i%10 == 0) {
                    break;
                }
                
                
                s = "" + i + "" + j + "" +i*j;
                if (s.length() > 9) {
                    break;
                }
                if (s.length() == 9 && i*j%10 != 0) {
                
                    trying = Integer.parseInt(s.substring(0,9));
                    System.out.println(trying);
                    if (firstPrm(trying) == 123456789) {
                    
                        kontroll = 0;
                            for (int k = 0; k < v.size(); k++) {
                                Integer coni = (Integer) (v.get(k));
                                int con = (int) (coni);
                                if (con == i*j) {
                                    kontroll = 1;
                                    break;
                                }
                            }
                        if (kontroll == 0) {
                            v.add(i*j);
                            System.out.println(i*j);
                        }
                    }
                }
            }
        }
        System.out.println(v);
        int sum = 0;
        int vec =0;
        for (int k = 0; k < v.size(); k++) {
            Integer veci = (Integer) (v.get(k));
            vec = (int) (veci);
            sum = sum + vec;
        }
        System.out.println(sum);

    }
}