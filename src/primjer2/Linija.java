package primjer2;

import primjer1.Tocka2D;

public class Linija {
    Tocka2D t1;
    Tocka2D t2;

    public Linija() {
        this.t1 = new Tocka2D();
        this.t2 = new Tocka2D(1,2);
    }

    public Linija(Tocka2D t1, Tocka2D t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public double duzina (){
        return Tocka2D.udaljenost(this.t1, this.t2);
    }

    public Tocka2D getT1() {
        return t1;
    }

    public void setT1(Tocka2D t1) {
        this.t1 = t1;
    }

    public Tocka2D getT2() {
        return t2;
    }

    public void setT2(Tocka2D t2) {
        this.t2 = t2;
    }
}
