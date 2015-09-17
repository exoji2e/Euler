package notepc;
public class Problem_38 {
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
        
        String s = "";
        
        int check;
        
        int save = 0;
        
        
        for(int i = 5000; i<9876; i++) {
            s = i +""+ 2*i;
            
            check = Integer.parseInt(s.substring(0,s.length()));
            
            if (firstPrm(check) == 123456789) {
                save = check;
            }
        }
        System.out.println(save);
        
    }
}