public class Item {
    public static final double PDV = 0.17;

    protected String sifra;
    protected String naziv;
    protected double cijena;
    protected String kategorija;

    public Item(String sifra, String naziv, double cijena) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cijena = cijena;
        this.kategorija = "";
    }

    public double cijenaUkupno(int brojKomada){
        return (this.cijena * brojKomada) * (1+PDV);
    }

    public String getSifra() {
        return sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    @Override
    public String toString() {
        return this.sifra + " " + this.naziv;
    }
}
