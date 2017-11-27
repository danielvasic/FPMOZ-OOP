package labos01;

/**
 * Created by Daniel on 17.11.2017..
 */
public class Linija {
    private Tocka t1;
    private Tocka t2;

    public Linija() {
        this.t1 = new Tocka();
        this.t2 = new Tocka(1.0f, 1.0f);
    }

    public Linija(Tocka t1, Tocka t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public Tocka getT1() {
        return t1;
    }

    public void setT1(Tocka t1) {
        this.t1 = t1;
    }

    public Tocka getT2() {
        return t2;
    }

    public void setT2(Tocka t2) {
        this.t2 = t2;
    }

    public double duzina() {
        return this.t1.udaljenost(this.t2);
    }
}
