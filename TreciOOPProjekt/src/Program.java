import java.util.Scanner;

public class Program {
    public static void main(String [] args){
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite prvu točku:");
        double x1 = unos.nextDouble();
        double y1 = unos.nextDouble();

        System.out.println("Unesite drugu točku:");
        double x2 = unos.nextDouble();
        double y2 = unos.nextDouble();

        Tocka t1 = new Tocka(x1, y1);
        Tocka t2 = new Tocka(x2, y2);

        System.out.println(Tocka.udaljenost(t1, t2));
    }
}
