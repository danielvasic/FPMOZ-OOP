import java.util.Objects;

public class Tocka {
    private double x;
    private double y;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tocka tocka = (Tocka) o;
        return Double.compare(tocka.x, x) == 0 &&
                Double.compare(tocka.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public Tocka() {
        this.x = 0;
        this.y = 0;
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
        return "Tocka(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }

    public double udaljenost (Tocka t){
        double a  = Math.pow(this.x - t.getX(), 2);
        double b  = Math.pow(this.y - t.getY(), 2);
        return Math.sqrt(a+b);
    }
}
