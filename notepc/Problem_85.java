import java.util.Scanner;
public class Problem_85 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mata in ditt valda antal rektanglar som skall skapas i rutnätet.");
        int numbofrec = sc.nextInt(), differ = numbofrec;
        int area[] = new int[2];
        for(int bredd = 1; bredd*(bredd-1)/2 <= numbofrec; bredd++) {
            for(int hojd = 1; hojd*(hojd-1)/2 <= numbofrec && hojd*bredd*(hojd-1)*(bredd-1)/4 <= numbofrec; hojd++) {
                if(Math.abs(bredd*hojd*(bredd+1)*(hojd+1)/4 - numbofrec) < differ) {
                    differ = Math.abs(bredd*hojd*(bredd+1)*(hojd+1)/4 - numbofrec);
                    area[0] = bredd;
                    area[1] = hojd;
                }
            }            
        }
        System.out.println("Rutnätet som skapade närmst antal rektanglar till " + numbofrec + " var rutnätet med måtten: \nBredd:\t" + area[0] + "\nHöjd:\t" + area[1] + "\nArea:\t" + area[1]*area[0] + "\nRutnätet skapade: " + area[0]*area[1]*(area[0]+1)*(area[1]+1)/4 + " rektanglar. (skillnad = " + differ + " rektanglar)");
    }
}