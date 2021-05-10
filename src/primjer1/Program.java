package primjer1;

public class Program {
    public static void main (String [] args){
        Tocka2D t1 = new Tocka2D();
        Tocka2D t2 = new Tocka2D(1,2);
        System.out.println(Tocka2D.udaljenost(t1, t2));
    }
}
