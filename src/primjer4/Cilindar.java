package primjer4;

import primjer1.Tocka2D;
import primjer3.Krug;

public class Cilindar extends Krug {
    private double h;

    public Cilindar(double r, double h) {
        super(r);
        this.h = h;
    }

    public Cilindar() {
        super(5);
        this.h = 5;
    }

    public double dajOplosje(){
        return this.h * this.dajOpseg() + 2 * dajPovrsinu();
    }

    public double dajVolumen(){
        return this.h * dajPovrsinu();
    }
}
