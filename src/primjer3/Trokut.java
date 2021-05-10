package primjer3;

import primjer1.Tocka2D;

public class Trokut implements Oblik {
    Tocka2D t1;
    Tocka2D t2;
    Tocka2D t3;

    public Trokut(Tocka2D t1, Tocka2D t2, Tocka2D t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public Tocka2D getT1() {
        return t1;
    }

    public void setT1(Tocka2D t1) {
        this.t1 = t1;
    }

    public Tocka2D getT2() {
        return t2;
    }

    public void setT2(Tocka2D t2) {
        this.t2 = t2;
    }

    public Tocka2D getT3() {
        return t3;
    }

    public void setT3(Tocka2D t3) {
        this.t3 = t3;
    }

    @Override
    public double dajPovrsinu() {
        double a = t1.udaljenost(t2);
        double b = t2.udaljenost(t3);
        double c = t3.udaljenost(t1);
        double s = (a+b+c)/2;
        return Math.sqrt(
                s * (s-a) * (s-b) * (s-c)
        );
    }

    @Override
    public double dajOpseg() {
        return t1.udaljenost(t2) + t2.udaljenost(t3) + t3.udaljenost(t1);
    }
}
