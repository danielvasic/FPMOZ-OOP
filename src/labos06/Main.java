package labos06;

import java.io.*;

/**
 * Created by Daniel on 19.1.2018..
 */
public class Main {
    public static void main (String [] args) {
        String linija = "";
        String filenameRead = "src/labos06/vjezba01.txt";
        try {
            FileReader reader = new FileReader(filenameRead);
            BufferedReader bufferedReader = new BufferedReader(reader);

            while ((linija = bufferedReader.readLine()) != null) {
                System.out.println(linija);
            }

            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Datoteka nije pronadjena.");
        } catch (IOException e) {
            System.out.println ("Greska prilikom citanja");
        }

        String filenameWrite = "src/labos06/vjezba02.txt";

        try {
            FileWriter writer = new FileWriter(filenameWrite);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Dabar dan, ");
            bufferedWriter.write(" ja sam Daniel");
            bufferedWriter.newLine();
            bufferedWriter.write("Neki novi tekst.");

            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println ("Greska prilikom citanja.");
        }


    }

}
