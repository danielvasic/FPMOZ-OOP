package primjer9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Pisanje {
    public static void main (String [] args){
        File datoteka = new File("src/primjer9/Datoteka01.txt");
        try {
            FileOutputStream pisac = new FileOutputStream(datoteka);
            pisac.write("Ovo je neki tekst".getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("Ne postoji datoteka.");
        } catch (IOException e) {
            System.out.println("Nastala je greška prilikom pisanja u datoteku.");
        }
    }
}
