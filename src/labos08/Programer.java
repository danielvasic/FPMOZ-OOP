package labos08;

/**
 * Created by Daniel on 26.1.2018..
 */
public class Programer {
    private String ime;
    private String prezime;
    private float placa;

    public Programer(String ime, String prezime, float placa) {
        this.ime = ime;
        this.prezime = prezime;
        this.placa = placa;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public float getPlaca() {
        return placa;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setPlaca(float placa) {
        this.placa = placa;
    }
}
