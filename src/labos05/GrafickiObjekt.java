package labos05;

import labos01.Tocka;

import java.awt.*;

abstract public class GrafickiObjekt {
    Tocka ishodiste;

    GrafickiObjekt () {
        this.ishodiste = new Tocka(0,0);
    }
    public void pomakni (int x, int y) {
        ishodiste = new Tocka(ishodiste.getX()+x, ishodiste.getY()+y);
    }

    public abstract void nacrtaj (Graphics g);
    public abstract void povecaj (float s);

}
