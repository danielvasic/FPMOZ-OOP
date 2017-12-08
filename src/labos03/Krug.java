package labos03;

public class Krug implements GeometrijskiLik {
    private double radius;
    public static final double PI = 3.1415;

    public Krug() {
        this.radius = 1.0;
    }

    public Krug(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double povrsina() {
        return this.radius * this.radius * Krug.PI;
    }

    @Override
    public double opseg() {
        return 2 * this.radius * Krug.PI;
    }
}
