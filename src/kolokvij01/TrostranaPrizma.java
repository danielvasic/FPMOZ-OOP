package kolokvij01;

/**
 * Created by Daniel on 15.12.2017.ana prizma koja nasljeđuje od trokuta te nadodajte metode za izračun oplošja i volumena.
 * Napravite klasu Trostr
 */
public class TrostranaPrizma extends Trokut {
    public double h;

    public TrostranaPrizma(Trokut t, double h) {
        super(t.getL1(), t.getL2(), t.getL3());
        this.h = h;
    }

    public double oplosje () {
        return this.opseg() * this.h + 2 * this.povrsina();
    }

    public double volumen () {
        return this.povrsina() * this.h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
