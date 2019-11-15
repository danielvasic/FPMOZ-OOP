public class Beverage extends Item {
    public Beverage(String sifra, String naziv, double cijena) {
        super(sifra, naziv, cijena);
        this.kategorija = "Piće";
    }

    @Override
    public double cijenaUkupno(int brojKomada) {
        return this.cijena * brojKomada;
    }
}
