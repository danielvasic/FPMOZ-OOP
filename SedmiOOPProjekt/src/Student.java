public class Student {
    String ime;
    String prezime;
    String brojIndeksa;
    float prosjek;

    public Student(String ime, String prezime, String brojIndeksa, float prosjek) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.prosjek = prosjek;
    }

    @Override
    public String toString() {
        return ime + ' ' + prezime;
    }
}
