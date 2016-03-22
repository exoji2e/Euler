import java.util.Scanner;
import java.io.File;  
import java.io.IOException;
import java.util.Arrays;
public class Problem_59 {
    public static int[] Encrypt(int message[], int key[]) {
        
        int encryptedmess[] = new int[message.length];
        
        for(int i = 0; i<message.length; i+=3) {
            
            encryptedmess[i] = message[i] ^ key[0];
            
        }
        for(int i = 1; i<message.length; i+=3) {
            
            encryptedmess[i] = message[i] ^ key[1];
            
        }
        for(int i = 2; i<message.length; i+=3) {
            
            encryptedmess[i] = message[i] ^ key[2];
            
        }
        
        return encryptedmess;
        
    }
    
    public static void main(String args[]) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("vad heter filen?");
        
        String filename = sc.next();
        
        Scanner input = new Scanner(new File(filename));
        
        String s = input.next();
        
        String [] messages = s.split(",");
        int length = messages.length;

        
        int message[] = new int[length];
        for(int i = 0; i<length; i++) {
            message[i] = Integer.parseInt(messages[i]);
        }
        
        
        
        int key[] = new int[3];
        
        int savedkey[] = new int[3];
        
        int spaces = 0;
        
        int encryptedmess[] = new int[length];
        
        for(int k1 = 97; k1<123; k1++) {
            key[0] = k1;
            for(int k2 = 97; k2<123; k2++) {
                key[1] = k2;
                for(int k3 = 97; k3<123; k3++) {
                    key[2] = k3;
                    
                    encryptedmess = Encrypt(message, key);
                    int counter = 0;
                    for(int i = 0; i<length; i++) {
                        if(encryptedmess[i] == 32) {
                            counter++;
                        }
                    }
                    if(counter > spaces) {
                        for(int i = 0; i<3; i++) {
                            savedkey[i] = key[i];
                        }
                        spaces = counter;
                    }
                }           
            }
        }
        
        encryptedmess = Encrypt(message, savedkey);
        
        int asciisum = 0;
        
        for(int i = 0; i<length; i++) {
            char a = (char)(encryptedmess[i]);
            System.out.print(a);
            asciisum += encryptedmess[i];
        }
        System.out.println();

        System.out.println(asciisum);
        
        

    }
}