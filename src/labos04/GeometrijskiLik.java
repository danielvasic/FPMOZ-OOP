package labos04;

import labos01.Tocka;

public abstract class GeometrijskiLik {

    Tocka t1;

    public GeometrijskiLik() {
        t1 = new Tocka();
    }

    public GeometrijskiLik(Tocka t1) {
        this.t1 = t1;
    }

    public abstract double povrsina();
    public abstract double opseg();
}
