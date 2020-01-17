import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main (String [] args){
        String str = "Ovo ćemo zapisati u datoteku.";

        try {
            FileWriter fw = new FileWriter("datoteka.txt");
            fw.write(str);
            fw.close();
        } catch (IOException e) {
            System.out.println("Nastala je pogreška.");
        }

        try {
            FileReader fr = new FileReader("datoteka.txt");

            int ch = fr.read();

            while (ch > 0){
                System.out.print((char) ch);
                ch = fr.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nastala je pogreška: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Nastala je pogreška: " + e.getMessage());
        }
    }
}
