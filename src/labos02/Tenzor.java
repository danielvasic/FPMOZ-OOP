package labos02;

/**
 * Created by Daniel on 28.11.2017..
 */
public class Tenzor extends Vektor {
    private float z;

    public Tenzor(float i, float j, float k, float z) {
        super(i, j, k);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public static Tenzor zbroji (Tenzor t1, Tenzor t2) {
        float i = t1.getI() + t2.getI();
        float j = t1.getJ() + t2.getJ();
        float k = t1.getK() + t2.getK();
        float z = t1.getZ() + t2.getZ();
        return new Tenzor(i,j,k,z);
    }

    public static Tenzor zbroji (Tenzor t1, Vektor v2) {
        float i = t1.getI() + v2.getI();
        float j = t1.getJ() + v2.getJ();
        float k = t1.getK() + v2.getK();
        float z = t1.getZ();
        return new Tenzor(i,j,k,z);
    }

    @Override
    public String toString() {
        return "Tenzor{" +
                "i=" + this.getI() +
                ", j=" + this.getJ() +
                ", k=" + this.getK() +
                ", z=" + this.getZ() +
                '}';
    }
}
