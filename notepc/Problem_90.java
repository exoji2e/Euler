public class Problem_90 {
    public static void main(String args[]) {
        
        int c1s[] = new int [6];
        int c2s[] = new int [6];
        
        int cubes[] = new int [9];

        double counter = 0;
        
        
        while (c1s[0]<2) {
            c2s[0] = 0;
            while (c2s[0]<2) {
                c1s[1] = c1s[0] + 1;
                while (c1s[1]<6) {
                    c2s[1] = c2s[0] + 1;
                    while (c2s[1]<6) {
                        c1s[2] = c1s[1] + 1;
                        while (c1s[2]<7) {
                            c2s[2] = c2s[1] + 1;
                            while (c2s[2]<7) {
                                c1s[3] = c1s[2] + 1;
                                while (c1s[3]<8) {
                                    c2s[3] = c2s[2] + 1;
                                    while (c2s[3]<8) {
                                        c1s[4] = c1s[3] + 1;
                                        while (c1s[4]<9) {
                                            c2s[4] = c2s[3] + 1;
                                            while (c2s[4]<9) {
                                                c1s[5] = c1s[4] + 1;
                                                while (c1s[5]<10) {
                                                    c2s[5] = c2s[4] + 1;
                                                    while (c2s[5]<10 ) {
                                                        
                                                        cubes[0] = 0;
                                                        cubes[1] = 0;
                                                        cubes[2] = 0;
                                                        cubes[3] = 0;
                                                        cubes[4] = 0;
                                                        cubes[5] = 0;
                                                        cubes[6] = 0;
                                                        cubes[7] = 0;
                                                        cubes[8] = 0;
                                                        
                                                        for(int i = 0; i<6; i++) {
                                                            for(int j = 0; j<6; j++) {
                                                                String s1 ="" + c1s[i] + "" + c2s[j];
                                                                
                                                                if (cubes[0] == 0) {
                                                                    if (s1.equals("01") || s1.equals("10")) {
                                                                        cubes[0] = 1;
                                                                    }
                                                                } 
                                                                
                                                                if (cubes[1] == 0) {
                                                                    if (s1.equals("04") || s1.equals("40")) {
                                                                        cubes[1] = 1;
                                                                    }
                                                                }
                                                                
                                                                if (cubes[2] == 0) {
                                                                    if (s1.equals("09") || s1.equals("90") || s1.equals("06") || s1.equals("60")) {
                                                                        cubes[2] = 1;
                                                                    }
                                                                }
                                                                
                                                                if (cubes[3] == 0) {
                                                                    if (s1.equals("16") || s1.equals("61") || s1.equals("19") || s1.equals("91")) {
                                                                        cubes[3] = 1;
                                                                    }
                                                                }
                                                                
                                                                if (cubes[4] == 0) {
                                                                    if (s1.equals("25") || s1.equals("52")) {
                                                                        cubes[4] = 1;
                                                                    }
                                                                }
                                                                
                                                                if (cubes[5] == 0) {
                                                                    if (s1.equals("36") || s1.equals("63") || s1.equals("39") || s1.equals("93")) {
                                                                        cubes[5] = 1;
                                                                    }
                                                                }
                                                                
                                                                if (cubes[6] == 0 || cubes[7] == 0) {
                                                                    if (s1.equals("49") || s1.equals("94") || s1.equals("46") || s1.equals("64")) {
                                                                        cubes[6] = 1;
                                                                        cubes[7] = 1;
                                                                    }
                                                                }
                                                                
                                                                if (cubes[8] == 0) {
                                                                    if (s1.equals("81") || s1.equals("18")) {
                                                                        cubes[8] = 1;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                                 
                                                        
                                                        if(cubes[0] == 1 && cubes[1] == 1 && cubes[2] == 1 && cubes[3] == 1 && cubes[4] == 1 && cubes[5] == 1 && cubes[6] == 1 && cubes[7] == 1 && cubes[8] == 1) {
                                                            counter+=0.5;
                                                            
                                                        }
                                                        c2s[5]++;
                                                    }
                                                    c1s[5]++;

                                                }
                                                c2s[4]++;

                                            }
                                            c1s[4]++;

                                        }
                                        c2s[3]++;
                                    }
                                    c1s[3]++;
                                    
                                }
                                c2s[2]++;

                                
                            }
                            c1s[2]++; 

                        }
                        c2s[1]++;

                    }
                    c1s[1]++;

                
                }
                c2s[0]++;
            
            }
            c1s[0]++;
        }
        System.out.println((int)(counter));
    }
    
}