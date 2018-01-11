package labos05;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel{
    private Main () {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.add(this);
        setPreferredSize(new Dimension(600, 400));
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
    }

    public static void main (String [] args) {
        Main m = new Main();
    }
}
