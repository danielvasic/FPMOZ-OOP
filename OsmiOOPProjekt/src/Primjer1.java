import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Primjer1 {
    public static void main(String [] args){
        JFrame okvir = new JFrame();
        JButton gumb = new JButton("Klikni");
        gumb.setBounds(100, 100, 50, 50);
        okvir.add(gumb);

        gumb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame okvir2 = new JFrame("Neki nsalov");
                okvir2.setVisible(true);

                JLabel oznaka = new JLabel("Neki tekst");
                oznaka.setBounds(0, 0, 100, 100);
                okvir2.add(oznaka);

                okvir2.setLayout(null);
                okvir2.setSize(200, 200);
            }
        });

        okvir.setSize(400, 300);
        okvir.setLayout(null);
        okvir.setVisible(true);
    }
}
