package primjer5;

import primjer1.Tocka2D;

public class Program {
    public static void main (String [] args){
        Tocka3D t1 = new Tocka3D();
        Tocka3D t2 = new Tocka3D(4,5,6);

        Tocka2D t3 = new Tocka2D();
        Tocka2D t4 = new Tocka2D(1,2);

        System.out.println(Tocka3D.K);
        System.out.println(Tocka2D.udaljenost(t1, t2));
        System.out.println(Tocka3D.udaljenost(t3, t4));
        System.out.println(Tocka2D.udaljenost(t3, t4));
        System.out.println(t2);
        System.out.println(t3);
    }
}
