package primjer7;

public class Pravokutnik extends GrafickiObjekt {

    private double a;
    private double b;

    public Pravokutnik() {
        this.a = 1;
        this.b = 1;
    }

    public Pravokutnik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double povrsina() {
        return a * b;
    }

    @Override
    public double opseg() {
        return 2 * a + 2 * b;
    }

    @Override
    public void nacrtaj() {
        System.out.println("Ovo je pravokutnik površine " + this.povrsina() + " i opsega " + this.opseg());
    }

    @Override
    public void povecaj(double n) {
        this.a = this.a + n;
        this.b = this.b + n;
    }
}
