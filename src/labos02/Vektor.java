package labos02;

/**
 * Created by Daniel on 27.11.2017..
 */
public class Vektor {
    private float i;
    private float j;
    private float k;

    public Vektor() {
        this.i = 1.0f;
        this.j = 1.0f;
        this.k = 1.0f;
    }

    public Vektor(float i) {
        this.i = i;
        this.j = i;
        this.k = i;
    }

    public Vektor(float i, float j, float k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public float getI() {
        return i;
    }

    public void setI(float i) {
        this.i = i;
    }

    public float getJ() {
        return j;
    }

    public void setJ(float j) {
        this.j = j;
    }

    public float getK() {
        return k;
    }

    public void setK(float k) {
        this.k = k;
    }

    public static Vektor zbroji (Vektor v1, Vektor v2) {
        float i = v1.getI() + v2.getI();
        float j = v1.getJ() + v2.getJ();
        float k = v1.getK() + v2.getK();
        return new Vektor (i,j,k);
    }

    @Override
    public String toString() {
        return "Vektor{" +
                "i=" + i +
                ", j=" + j +
                ", k=" + k +
                '}';
    }
}
