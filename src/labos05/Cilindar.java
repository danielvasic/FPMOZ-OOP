package labos05;

import java.awt.*;

public class Cilindar extends Kruznica {
    private float visina;

    Cilindar(float radius, float visina) {
        super(radius);
        this.visina = visina;
    }

    @Override
    public void nacrtaj(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(
                (int)ishodiste.getX(),
                (int)ishodiste.getY()+(int)(this.radius/2),
                (int)this.radius,
                (int)this.visina
        );
        super.nacrtaj(g);
        this.pomakni(0, (int) this.visina);
        super.nacrtaj(g);
    }

    public void povecaj (float s) {
        this.radius += (s*this.radius);
        this.visina += (s*this.visina);
    }
}
