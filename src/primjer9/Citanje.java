package primjer9;

import java.io.*;

public class Citanje {
    public static void main (String [] args){
        File datoteka = new File("src/primjer9/Datoteka.txt");
        try {
            FileReader citac = new FileReader(datoteka);
            BufferedReader citacMedjuspremnik = new BufferedReader(citac);
            String linija = citacMedjuspremnik.readLine();
            while(linija != null){
                System.out.println(linija);
                linija = citacMedjuspremnik.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Datoteka ne postoji, provjerite putanju.");
        } catch (IOException e) {
            System.out.println("Nastao je problem s čitanjem iz datoteke.");
        }
    }
}
