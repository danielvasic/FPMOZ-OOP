package kolokvij01;

/**
 * Created by Daniel on 15.12.2017..
 */
public class Tocka
{
    private double x;
    private double y;

    public Tocka() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Tocka(double x) {
        this.x = x;
        this.y = x;
    }

    public Tocka(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Tocka{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
