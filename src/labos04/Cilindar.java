package labos04;
import labos01.Tocka;
import labos03.GeometrijskoTijelo;

public class Cilindar extends Krug implements GeometrijskoTijelo {
    private double visina;

    public Cilindar() {
        this.visina = 1.0;
    }

    public Cilindar(double visina) {
        this.visina = visina;
    }

    public Cilindar(Tocka t1, double radius, double visina) {
        super(t1, radius);
        this.visina = visina;
    }

    @Override
    public double volumen() {
        System.out.println(this.radius);
        return this.povrsina () * this.visina;
    }

    @Override
    public double oplosje() {
        return this.opseg() * this.visina + 2 * this.povrsina();
    }

    @Override
    public String toString() {
        return "Cilindar{" +
                "ishodiste=" + t1 +
                ", radius=" + radius +
                ", visina=" + visina +
                '}';
    }
}
