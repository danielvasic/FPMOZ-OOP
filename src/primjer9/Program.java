package primjer9;

public class Program {
    public static void main (String [] args){
        try {
            Razlomak r = new Razlomak(1, 1);
        } catch (RazlomakIznimka e) {
            System.out.println(e.getMessage());
        }
    }
}
