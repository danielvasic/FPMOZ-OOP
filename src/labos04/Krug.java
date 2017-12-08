package labos04;

import labos01.Tocka;

public class Krug extends GeometrijskiLik {

    protected double radius;

    public Krug() {
        this.radius = 1.0;
    }

    public Krug(double radius) {
        this.radius = radius;
    }

    public Krug(Tocka t1, double radius) {
        super(t1);
        this.radius = radius;
    }

    @Override
    public double povrsina() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double opseg() {
        return (this.radius + this.radius) * Math.PI;
    }

    @Override
    public String toString() {
        return "Krug{" +
                "ishodiste=" + t1 +
                "radius=" + radius +
                '}';
    }
}
