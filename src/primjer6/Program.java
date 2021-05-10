package primjer6;

public class Program {
    public static void main (String [] args){
        Proizvod p1 = new Proizvod(
                "23",
                "Coca-Cola",
                1.5f
        );

        Pice p2 = new Pice(
                "24",
                "Sprite",
                1.2f
        );

        p2.setLitraza(0.5f);

        Hrana h1 = new Hrana(
                "25",
                "Kruh",
                1.5f,
                "11.05.2021.");

        Kosarica k = new Kosarica();

        k.dodaj(p1);
        k.dodaj(p2);
        k.dodaj(h1);
        k.dodaj(new Odjeca("26", "Kaput", 52.0f));

        System.out.println(k.ukupno());

    }
}
