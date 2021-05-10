package primjer6;

public class Pice extends Proizvod {
    private float litraza;

    public Pice(String sifra, String naziv, float cijena) {
        super(sifra, naziv, "Piće", cijena);
    }

    public float getLitraza() {
        return litraza;
    }

    public void setLitraza(float litraza) {
        this.litraza = litraza;
    }

    @Override
    public String toString() {
        return  this.sifra + " " + this.naziv + " " + this.litraza;
    }
}
