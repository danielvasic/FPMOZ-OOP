package kolokvij01;

/**
 * Created by Daniel on 15.12.2017..
 */
public class Trokut {
    protected Linija l1;
    protected Linija l2;
    protected Linija l3;

    public Trokut() {
        Tocka t1 = new Tocka(1,1);
        Tocka t2 = new Tocka(-1,1);
        Tocka t3 = new Tocka(1,-1);

        l1 = new Linija(t1, t2);
        l2 = new Linija(t2, t3);
        l3 = new Linija(t3, t1);
    }

    public Trokut(Linija l1, Linija l2, Linija l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public Linija getL1() {
        return l1;
    }

    public void setL1(Linija l1) {
        this.l1 = l1;
    }

    public Linija getL2() {
        return l2;
    }

    public void setL2(Linija l2) {
        this.l2 = l2;
    }

    public Linija getL3() {
        return l3;
    }

    public void setL3(Linija l3) {
        this.l3 = l3;
    }

    @Override
    public String toString() {
        return "Trokut{" +
                "l1=" + l1 +
                ", l2=" + l2 +
                ", l3=" + l3 +
                '}';
    }

    public double opseg () {
        return l1.duljina() + l2.duljina() + l3.duljina();
    }

    public double povrsina () {
        double a = l1.duljina();
        double b = l2.duljina();
        double c = l3.duljina();

        double s = (a+b+c)/2;
        return s*(s-a)*(s-b)*(s-c);
    }

    public static Tocka teziste (Trokut t) {
        double xt = t.getL1().getT1().getX() + t.getL2().getT1().getX() + t.getL3().getT1().getX();
        double yt = t.getL1().getT1().getY() + t.getL2().getT1().getY() + t.getL3().getT1().getY();
        return new Tocka(xt, yt);
    }
}
