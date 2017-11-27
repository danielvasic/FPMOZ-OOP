package labos02;

public class Main
{
    public static void main (String [] args) {
        Vektor v1 = new Vektor();
        Vektor v2 = new Vektor(1.0f, 2.0f, 3.0f);
        Vektor v3 = Vektor.zbroji(v1, v2);
        System.out.println(v3);

        Tenzor t1 = new Tenzor(2.0f, 3.0f, 4.0f, 5.0f);
        Tenzor t2 = Tenzor.zbroji(t1, v3);
        System.out.println(t2);
    }
}
