package primjer3;

import primjer1.Tocka2D;

public class Program {
    public static void main (String [] args){
        Krug k = new Krug(5);
        System.out.println("Opseg kruga je " + k.dajOpseg());
        System.out.println("Povrsina kruga je " + k.dajPovrsinu());

        Trokut t1 = new Trokut(
                new Tocka2D(), new Tocka2D(1,1), new Tocka2D(1, -1)
        );

        System.out.println("Opseg trokuta je " + t1.dajOpseg());
        System.out.println("Povrsina trokuta je " + t1.dajPovrsinu());

    }
}
