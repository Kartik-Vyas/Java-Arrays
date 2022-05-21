package vyas;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
//        int [] var = new int[];
//        Integer [] var1 = new Integer[];
        Scanner s  = new Scanner(System.in);
        Cricket [] c = new Cricket[3];
        for(int i = 0 ; i < 3; i++){
            String name = s.next();
            int x = s.nextInt();
            Cricket c1 = new Cricket(name,x);
            c[i] = c1;

        }
       for(int i = 0; i<3;i++){
       c[i].m1();
       int x1  = c[i].m2(i);
           System.out.println(x1);
       }

    }
}
 class Cricket {
    String name;
    int run;
    public Cricket(String name,int run)
    {
        this.name =name;
        this.run = run;
    }
    public void m1(){
        System.out.println(name+" " + run);
    }
    public int m2(int value)
    {
        return value;
    }

}

