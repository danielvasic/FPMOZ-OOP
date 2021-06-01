package primjer8;

public class Tocka2D<T> {
    T x;
    T y;

    public Tocka2D(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Tocka2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
