import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Problem_54 {
    
    
    
    public static int[] sort(String[] s) {
        int[] nbrs = new int[s.length];
        
        for(int i = 0; i<s.length; i++){
            if(s[i].charAt(0) == 'T')
                nbrs[i] = 10;
            else if(s[i].charAt(0) == 'J')
                nbrs[i] = 11;
            else if(s[i].charAt(0) == 'Q')
                nbrs[i] = 12;
            else if(s[i].charAt(0) == 'K')
                nbrs[i] = 13;
            else if(s[i].charAt(0) == 'A')
                nbrs[i] = 14;
            else
                nbrs[i] = Integer.parseInt("" +s[i].charAt(0));
        }
        
        Arrays.sort(nbrs);
        return nbrs; 
    }
    
    public static boolean isRoyal(int[] n) {
        return(straightCheck(n) == 10);
    }
    
    public static int straightCheck(int[] n) {
        int start = n[0];
        for(int i = 1; i<n.length; i++) {
            if(n[i] != i+start) {
                return 0;
            }
        }
        return start;
    }
    
    public static int equalcards(int[] n, int c) {
        for(int i = n.length-1; i>=c-1; i--) {
            int check = n[i];
            boolean works = true;
            for(int j = i-1; j>i-c; j--) {
                if(n[j] != check) {
                    works = false;
                    break;
                }
            }
            if(works)
                return check;
        }
        return 0;
    }
        
    public static boolean isFlush(String[] s) {
        char colour = s[0].charAt(1);
        for(int i = 1; i<s.length; i++) {
            if(colour != s[i].charAt(1)) {
                return false;
            }
        }
        return true;
    }
    
    public static int[] delete(int[] orignbr, int deleting) {
        int[] nbr = orignbr;
        int size = 0;
        for(int i = 0; i<nbr.length; i++) {
            if(nbr[i] != deleting) {
                size++;
            }
        }
        int returnarray[] = new int[size];
        int j = 0;
        for(int i = 0; i<nbr.length; i++) {
            if(nbr[i] != deleting)
                returnarray[j++] = nbr[i];
        }
        return returnarray;
    }
    
    public static int[] rankPlayer(int originalhand[], boolean flush) {
        
        int[] hand = originalhand;
        
        int[] ranking = new int[6];
        
        if(flush && isRoyal(hand)) {
            ranking[0] = 10;
        }else if(flush && straightCheck(hand) != 0) {
            ranking[0] = 9;
            ranking[1] = straightCheck(hand);
        }else if(equalcards(hand,4) != 0) {
            ranking[0] = 8;
            ranking[1] = equalcards(hand,4);
            hand = delete(hand,ranking[1]);
            ranking[2] = hand[0];
        }else if(equalcards(hand,3) != 0) {
            ranking[1] = equalcards(hand,3);

            hand = delete(hand,ranking[1]);
            if(equalcards(hand,2) != 0) {
                ranking[0] = 7;
                ranking[2] = equalcards(hand,2);
            } else {
                ranking[0] = 4;
                ranking[2] = hand[1];
                ranking[3] = hand[0];
            }
        }else if(flush) {
            ranking[0] = 6;
            ranking[1] = hand[4];
            ranking[2] = hand[3];
            ranking[3] = hand[2];
            ranking[4] = hand[1];
            ranking[5] = hand[0];
        }else if(straightCheck(hand) != 0) {
            ranking[0] = 5;
            ranking[1] = straightCheck(hand);
        }else if(equalcards(hand,2) != 0) {
            ranking[1] = equalcards(hand,2);
            hand = delete(hand,ranking[1]);
            if(equalcards(hand,2) != 0) {
                ranking[0] = 3;
                ranking[2] = equalcards(hand,2);
                hand = delete(hand,ranking[2]);
                ranking[3] = hand[0];
            } else {
                ranking[0] = 2;
                ranking[2] = hand[2];
                ranking[3] = hand[1];
                ranking[4] = hand[0];
            }
        } else {
        
            ranking[0] = 1;
            ranking[1] = hand[4];
            ranking[2] = hand[3];
            ranking[3] = hand[2];
            ranking[4] = hand[1];
            ranking[5] = hand[0];
            System.out.println(ranking[1] + " " + ranking[2] + " " + ranking[3] + " " + ranking[4] + " " + ranking[5]);
        }
        return ranking;
    }
    
    public static boolean p1win(int[] rankingp1, int[] rankingp2) {
        for(int i = 0; i<6; i++) {
            if(rankingp1[i] < rankingp2[i]) {
                return false;
            } else if(rankingp1[i] > rankingp2[i]) {
                return true;
            }
        }
        System.out.println("fel");
        return false;
        
    }
    
    
    public static void main(String args[]) throws IOException {
        Scanner input = new Scanner(new File("poker.txt"));
        int wins = 0;
        int nbr = 0;
        while(input.hasNext()) {
            String s = input.nextLine();
            String p1 = s.substring(0, 14);
            String p2 = s.substring(15, s.length());
            String[] p1arr = p1.split(" ");
            String[] p2arr = p2.split(" ");
            //System.out.println(p1);
            
            if(p1win(rankPlayer(sort(p1arr), isFlush(p1arr)),rankPlayer(sort(p2arr), isFlush(p2arr)))) {
                wins++;
            }
            nbr++;
               
            
        }
        System.out.println(wins + " " + nbr);


        
    }
}