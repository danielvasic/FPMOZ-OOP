import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main (String [] args){
        String a = null;
        try{
            a.length();
            int b = 2 / 0;
        } catch (ArithmeticException e){
            System.out.println("Ne možete djeliti s 0.");
        } catch (NullPointerException e) {
            System.out.println("Nastao je null pointer....");
        }

        String text = "Ovo je neki tekst.";
        FileWriter fw = null;
        try {
            fw = new FileWriter("tekst.txt", true);
            fw.write(text + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Nastala je greška prilikom otvaranja datoteke: " + e.getMessage());
        }

        try {
            FileReader fr = new FileReader("tekst.txt");
            int ch = fr.read();
            while (ch > 0){
                System.out.print((char) ch);
                ch = fr.read();
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nastala je greška prilikom otvaranja datoteke: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
