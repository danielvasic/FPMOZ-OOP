package kolokvij01;

/**
 * Created by Daniel on 15.12.2017..
 */
public class Linija {
    Tocka t1;
    Tocka t2;

    public Linija() {
        this.t1 = new Tocka(0.0,0.0);
        this.t2 = new Tocka(1.0, 1.0);
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

    public double duljina () {
        return Math.sqrt(Math.pow(t1.getX() - t2.getX(), 2) + Math.pow(t1.getY() - t2.getY(),2));
    }

    @Override
    public String toString() {
        return "Linija{" +
                "t1=" + this.t1 +
                ", t2=" + this.t2 +
                '}';
    }
}
