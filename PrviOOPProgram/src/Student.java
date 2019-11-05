public class Student {
    private String ime;
    private String prezime;
    private String brojIndeksa;
    private String studij;
    private String datumRodjenja;

    public Student (String ime, String prezime, String brojIndeksa, String studij, String datumRodjenja){
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.studij = studij;
        this.datumRodjenja = datumRodjenja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getStudij() {
        return studij;
    }

    public void setStudij(String studij) {
        this.studij = studij;
    }

    public String getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(String datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String toString(){
        return this.ime + " " + this.prezime;
    }
}
