public class Tocka2D {
    private float x;
    private float y;

    public Tocka2D () {
        this.x = 0;
        this.y = 0;
    }

    public Tocka2D (float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX (){
        return this.x;
    }

    public float getY(){
        return this.y;
    }

    public void setX(float x){
        this.x = x;
    }

    public void setY(float y){
        this.y = y;
    }
}
