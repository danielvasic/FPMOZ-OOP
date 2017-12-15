package kolokvij01;

/**
 * Created by Daniel on 15.12.2017..
 */
public class Main {
    public static void main (String [] args) {
        Tocka t1 = new Tocka();
        Tocka t2 = new Tocka(1,1);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println("Osvojili ste 10 bodova.");

        Linija l1 = new Linija(new Tocka(2,2), new Tocka (2, -2));
        System.out.println (l1 + " i njena duljina " + l1.duljina());
        System.out.println("Osvojili ste 15 bodova.");
        Trokut tr1 = new Trokut();
        System.out.println (tr1.opseg() + " " +tr1.povrsina());
        System.out.print(Trokut.teziste(tr1));
        System.out.println("Osvojili ste 20 bodova.");
        TrostranaPrizma prizma = new TrostranaPrizma(tr1, 10.0);
        System.out.println("Osvojili ste 25 bodova.");
        System.out.println(prizma.oplosje() + " " + prizma.volumen());
        System.out.println("Osvojili ste 30 bodova.");
    }
}
