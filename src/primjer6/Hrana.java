package primjer6;

public class Hrana extends Proizvod {
    private String rok;
    private String masa;

    public Hrana(String sifra, String naziv, float cijena, String rok) {
        super(sifra, naziv, "Hrana", cijena);
        this.rok = rok;
    }

    public String getRok() {
        return rok;
    }

    public void setRok(String rok) {
        this.rok = rok;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    @Override
    public String toString() {
        return this.sifra + " " + this.naziv + " " + this.rok;
    }
}
