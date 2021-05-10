package primjer1;

public class Tocka2D {
    private double x;
    private double y;

    public Tocka2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Tocka2D() {
        this.x = 0;
        this.y = 0;
    }

    public double udaljenost (Tocka2D t2){
        double x_2 = Math.pow(this.x - t2.x, 2);
        double y_2 = Math.pow(this.y - t2.y, 2);
        return Math.sqrt(x_2 + y_2);
    }

    public static double udaljenost (Tocka2D t1, Tocka2D t2){
        return Math.sqrt(Math.pow(t1.x-t2.x, 2) + Math.pow(t1.y-t2.y, 2));
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
}
