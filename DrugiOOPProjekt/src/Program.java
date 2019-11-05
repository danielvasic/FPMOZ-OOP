public class Program {
    public static void main(String [] args){
        Tocka t1 = new Tocka();
        Tocka t2 = new Tocka(1,0);
        System.out.println(t1.equals(t1));
        double udaljenost = t1.udaljenost(t2);
        System.out.println(udaljenost);
    }
}
