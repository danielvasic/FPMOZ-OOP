package labos01;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Tocka t1 = new Tocka();
        Tocka t2 = new Tocka(1.0f, 2.0f);
        double udaljenost = t1.udaljenost(t2);
        System.out.println(udaljenost);

        Linija l = new Linija(t1, t2);
        System.out.println(l.duzina());
    }
}
