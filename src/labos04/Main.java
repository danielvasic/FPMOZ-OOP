package labos04;

import labos01.Tocka;

public class Main {

    public static void main (String [] args) {
        Cilindar c1 = new Cilindar(2.5);
        System.out.println(c1);

        Cilindar c2 = new Cilindar(new Tocka(1.0f, 5.0f), 5.5, 3.0);
        System.out.println(c2);

    }
}
