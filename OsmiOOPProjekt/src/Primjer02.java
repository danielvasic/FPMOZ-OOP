import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Primjer02 {
    public static void main (String [] args){
        JFrame okvir = new JFrame("Uređivač teksta");
        okvir.setSize(500, 400);

        final JTextArea unosPolje = new JTextArea();
        JScrollPane scroll = new JScrollPane(unosPolje);
        scroll.setBounds(0,0, 500, 325);

        JButton gumb = new JButton("Spasi tekst");
        gumb.setBounds(400, 325, 100, 50);

        gumb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String unos = unosPolje.getText().toString();
                try {
                    FileWriter fw = new FileWriter("datoteka.txt");
                    fw.write(unos);
                    fw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        okvir.add(scroll);
        okvir.add(gumb);

        okvir.setLayout(null);
        okvir.setVisible(true);
        okvir.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
