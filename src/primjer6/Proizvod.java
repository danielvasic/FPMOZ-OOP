package primjer6;

public class Proizvod {
    protected String sifra;
    protected String naziv;
    protected String kategorija;
    protected float cijena;
    protected static final float PDV = 0.17f;

    public float ukupna_cijena(int n) {
        return (n * this.cijena) + ((n * this.cijena) * PDV);
    }

    public Proizvod(String sifra, String naziv, float cijena) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cijena = cijena;
    }

    public Proizvod(String sifra, String naziv, String kategorija, float cijena) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.kategorija = kategorija;
        this.cijena = cijena;
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

    public String getKategorija() {
        return kategorija;
    }

    public float getCijena() {
        return cijena;
    }

    public void setCijena(float cijena) {
        this.cijena = cijena;
    }

    @Override
    public String toString() {
        return this.sifra + " " + this.naziv;
    }
}
