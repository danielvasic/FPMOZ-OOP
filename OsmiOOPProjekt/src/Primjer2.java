import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Primjer2 {
    public static void main (String [] args){
        JFrame okvir = new JFrame("Editor");
        okvir.setSize(500, 500);

        final JTextArea polje = new JTextArea();
        JScrollPane unos = new JScrollPane(polje);
        unos.setBounds(10, 10, 480, 100);

        JButton gumb = new JButton("Spasi");
        gumb.setBounds(10, 120, 100, 30);

        gumb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = polje.getText();
                try {
                    FileWriter fw = new FileWriter("datoteka.txt");
                    fw.write(tekst);
                    fw.flush();
                    fw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });


        okvir.add(unos);
        okvir.add(gumb);

        okvir.setLayout(null);
        okvir.setVisible(true);
    }
}
