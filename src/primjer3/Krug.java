package primjer3;

import primjer1.Tocka2D;

public class Krug implements Oblik {
    Tocka2D s;
    double r;

    public Krug() {
        s = new Tocka2D();
        r = 1.0;
    }

    public Krug(Tocka2D s, double r) {
        this.s = s;
        this.r = r;
    }

    public Krug(double r) {
        this.s = new Tocka2D();
        this.r = r;
    }

    public Tocka2D getS() {
        return s;
    }

    public void setS(Tocka2D s) {
        this.s = s;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double dajPovrsinu() {
        return this.r * this.r * Math.PI;
    }

    @Override
    public double dajOpseg() {
        return 2 * this.r * Math.PI;
    }
}
