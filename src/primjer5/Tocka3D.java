package primjer5;

import primjer1.Tocka2D;

public class Tocka3D extends Tocka2D {
    public static final int K = 10;

    private double z;

    public Tocka3D() {
        super();
        this.z = 0;
    }

    public Tocka3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public static double udaljenost (Tocka3D t1, Tocka3D t2){
        return Math.sqrt(Math.pow(t1.getX()-t2.getX(), 2) + Math.pow(t1.getY()-t2.getY() , 2) + Math.pow(t1.z-t2.z , 2));
    }

    @Override
    public String toString() {
        return "Tocka3D(" +
                this.getX() + ","+ this.getY() + "," + z +
                ")";
    }
}
