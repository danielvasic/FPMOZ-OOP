package primjer7;

public class Kruznica extends GrafickiObjekt {

    private double radius;

    public Kruznica() {
        this.radius = 1.0d;
    }

    public Kruznica(double radius) {
        this.radius = radius;
    }

    @Override
    public double povrsina () {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double opseg() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    void nacrtaj() {
        System.out.println("Ovo je kružnica površine " + this.povrsina() + " i opsega " + this.opseg());
    }

    @Override
    void povecaj(double n) {
        this.radius = this.radius + n;
    }
}
