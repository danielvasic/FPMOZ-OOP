package primjer7;

import primjer1.Tocka2D;

public abstract class GrafickiObjekt {
    Tocka2D ishodiste;

    public Tocka2D getIshodiste() {
        return ishodiste;
    }

    public void setIshodiste(Tocka2D ishodiste) {
        this.ishodiste = ishodiste;
    }

    public GrafickiObjekt() {
        this.ishodiste = new Tocka2D();
    }

    public GrafickiObjekt(Tocka2D ishodiste) {
        this.ishodiste = ishodiste;
    }

    public void pomakni (int x, int y){
        this.ishodiste = new Tocka2D(
                 x, y
        );
    }

    abstract double povrsina();
    abstract double opseg();
    abstract void nacrtaj();
    abstract void povecaj(double n);
}
