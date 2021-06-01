package primjer9;

public class Razlomak {
    private double brojnik;
    private double nazivnik;



    public Razlomak(double brojnik, double nazivnik) throws RazlomakIznimka {
        if (nazivnik == 0.0d){
            throw new RazlomakIznimka("Nazivnik ne smije biti jednak 0.");
        }
        this.brojnik = brojnik;
        this.nazivnik = nazivnik;
    }
}
