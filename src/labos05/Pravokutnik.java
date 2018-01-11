package labos05;

import java.awt.*;

/**
 * Created by Daniel on 11.1.2018..
 */
public class Pravokutnik extends GrafickiObjekt {
    float sirina;
    float visina;

    Pravokutnik (float sirina, float visina) {
        this.sirina = sirina;
        this.visina = visina;
    }


    @Override
    public void nacrtaj(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(
                (int)this.ishodiste.getX(),
                (int)this.ishodiste.getY(),
                (int)this.sirina,
                (int)this.visina);
    }

    @Override
    public void povecaj(float s) {
        this.sirina += (this.sirina*s);
        this.visina += (this.visina*s);
    }
}
