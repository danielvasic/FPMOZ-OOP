package primjer2;

import primjer1.Tocka2D;

public class Program {
    public static void main (String [] args){
        Linija l1 = new Linija(new Tocka2D(3,5), new Tocka2D(7,12));
        System.out.println(l1.duzina());
    }
}
