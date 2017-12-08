package labos03;

public class Cilindar extends Krug implements GeometrijskoTijelo {
    private double visina;

    public Cilindar() {
        this.visina = 1.0;
    }

    public Cilindar(double radius, double visina) {
        super(radius);
        this.visina = visina;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    @Override
    public double volumen() {
        return this.povrsina() * this.visina;
    }

    @Override
    public double oplosje() {
        return this.opseg() * this.visina + 2*this.povrsina();
    }
}
