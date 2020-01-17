import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Primjer01 {
    public static void main (String [] args){
        JFrame okvir = new JFrame("Ovo je moj prozor");
        okvir.setSize(400, 300);

        JButton gumb = new JButton("Ovo je moj prvi gumb");
        gumb.setBounds(150, 125, 100, 50);
        okvir.add(gumb);

        gumb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame okvir2 = new JFrame("Ovo je moj novi okvir");
                okvir2.setSize(200, 150);
                okvir2.setVisible(true);
            }
        });

        okvir.setLayout(null);
        okvir.setVisible(true);
        okvir.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
