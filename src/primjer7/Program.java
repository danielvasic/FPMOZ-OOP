package primjer7;

public class Program {
    public static void main (String args []) {
        Kruznica k = new Kruznica(2);
        k.nacrtaj();
        k.povecaj(3);
        k.nacrtaj();

        Pravokutnik p = new Pravokutnik(1,2);
        p.nacrtaj();
        p.povecaj(5);
        p.nacrtaj();
    }
}
