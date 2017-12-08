package labos03;

public class Main {
    public static void main (String [] args) {
        Krug k1 = new Krug();
        Krug k2 = new Krug(2.5);

        System.out.println(k1.opseg() + " " + k1.povrsina());
        System.out.println(k2.opseg() + " " + k2.povrsina());

        Cilindar c1 = new Cilindar(2.5, 5.0);
        System.out.println(c1.opseg() + " " + c1.povrsina());
        System.out.println(c1.oplosje() + " " + c1.volumen());

    }
}
