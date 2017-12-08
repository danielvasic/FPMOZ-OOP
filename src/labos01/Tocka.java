package labos01;

public class Tocka {

    private float x;
    private float y;

    public Tocka() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Tocka(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public double udaljenost(Tocka t2) {
        return Math.sqrt(Math.pow(t2.getX() - this.x, 2) +
                Math.pow(t2.getY() - this.y, 2));
    }

    @Override
    public String toString() {
        return "Tocka{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
