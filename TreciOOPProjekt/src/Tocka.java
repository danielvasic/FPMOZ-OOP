public class Tocka {
    private double x;
    private double y;

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

    public static double udaljenost (Tocka t1, Tocka t2){
        double a = t1.getX() - t2.getX();
        double b = t1.getY() - t2.getY();

        return Math.sqrt(a*a + b*b);
    }
}
