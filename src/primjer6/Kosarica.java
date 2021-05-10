package primjer6;

import java.util.ArrayList;
import java.util.List;

public class Kosarica {
    private List<Proizvod> proizvodi = new ArrayList<>();

    public void dodaj (Proizvod proizvod) {
        this.proizvodi.add(proizvod);
    }

    public float ukupno (){
        float sum = 0;
        for (Proizvod p : this.proizvodi){
            sum += p.getCijena();
        }
        return sum;
    }
}
