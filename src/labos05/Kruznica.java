package labos05;

import java.awt.*;

public class Kruznica extends GrafickiObjekt {
    protected float radius;

    Kruznica (float radius) {
        this.radius = radius;
    }

    @Override
    public void nacrtaj(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(
                (int)this.ishodiste.getX(),
                (int)this.ishodiste.getY(),
                (int)this.radius,
                (int)this.radius
        );
    }

    @Override
    public void povecaj(float s) {
        this.radius += (this.radius*s);
    }
}
