public class Problem_139 {
    public static int gcdNy(int m, int n) {
        for (int i = n; i>0; i--) {
            if(m%i == 0 && n%i == 0) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String args[]) {
        int tmp;
        int x = 1;
        int sum = 0;
        for (int m = 2; m<10000; m++) {
            for (int n=1; n<m; n++) {
                if(gcdNy(m,n) == 1) {
                    int p = 2*m*(m+n);
                    if(p > 100000000) {
                        break;
                    }
                
                    int a = m*m - n*n;
                    int b = 2*m*n;
                    int c = m*m + n*n;
                
                    if(c%(b-a) == 0) {
                        x++;
                        if(x%2 == 0) {


                            tmp = 100000000/p;
                            sum += tmp;
                            System.out.println(sum +" " + a+ " " + b + " " +c);
                        }
                    }
                }
            }

        }
        System.out.println(sum);
    }
}

/*
        
        
        for (int c = 5; c<50000000; c++) {
            for (int diff = 1; diff<c; diff++) {
                if(c%diff == 0) {
                    for (int a = (c-diff)/2; (2*a*a - 2*a*diff + diff*diff)<=(c*c); a++) {
                         if(2*a*a - 2*a*diff + diff*diff == c*c) {
                             countTile++;
                             System.out.println(c+ " " + countTile);
                         }
                        
                    }
                }
            }
        }
        System.out.println(countTile);
    }
}
        
        
        int c;
        int countTile = 0;
        int csq;
        int holeSide;
        
        
        
        for (int p = 12; p<=100000000; p++) {
            for (int a = 1; a<p/3; a++) {
                for (int b = a+1; b<p/2; b++) {
                    c = p-(a+b);
                    if(c*c == a*a + b*b) {
                        holeSide = b-a;
                        if(c%holeSide == 0) {
                            countTile++;
                            System.out.println(countTile + " " + p);
                        }
                    }
                    
                }
            }
        }
    }
}

public class Problem_139 {
    public static void main(String args[]) {
        double c;
        int count = 0;
        
        for(int a = 1; a<30000000; a++) {
            for(long diff = 1; diff<59000000-a; diff++) {
                c = Math.sqrt(2*a*a + 2*a*diff + diff*diff);
                
                if(c%diff == 0) {
                    if (c+2*a+diff >= 100000000) {
                        break;
                    }
                    count++;
                    System.out.println(count + "<count || a> " + a + "^2 + " + (a+diff)+ "^2 = " + c + "^2");
                    
                }
            }
            
        }
    }
    
}
*/