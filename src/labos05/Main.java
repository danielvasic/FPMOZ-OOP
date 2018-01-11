package labos05;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel{
    private Main () {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.add(this);
        frame.setPreferredSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Crtanje uz pomoć JFrame komponente");
        frame.pack();
    }

    public void paint (Graphics g) {
        super.paint(g);
        Kruznica k = new Kruznica(10.0f);
        k.pomakni(10, 10);
        k.povecaj(10);
        k.nacrtaj(g);

        Pravokutnik p = new Pravokutnik(10.0f, 10.0f);
        p.pomakni(10, 10);
        p.povecaj(5);
        p.nacrtaj(g);

        Cilindar c = new Cilindar(10.0f, 20.0f);
        c.pomakni(200, 200);
        c.povecaj(4);
        c.nacrtaj(g);
    }

    public static void main (String [] args) {
        Main m = new Main();
    }
}
