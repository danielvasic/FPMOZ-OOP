package labos07;

/**
 * Created by Daniel on 26.1.2018..
 */
public class Tocka<T> {
    T x;
    T y;

    public Tocka(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Tocka{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
