package primjer6;

public class Odjeca extends Proizvod {
    private String velicina;
    public Odjeca(String sifra, String naziv, float cijena) {
        super(sifra, naziv, "Odjeća", cijena);
    }

    public String getVelicina() {
        return velicina;
    }

    public void setVelicina(String velicina) {
        this.velicina = velicina;
    }

    @Override
    public String toString() {
        return  this.sifra + " " + this.naziv + " " + this.velicina;
    }
}
