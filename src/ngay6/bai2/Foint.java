package ngay6.bai2;

public class Foint {
    private float x = 0f;
    private float y = 0f;

    public Foint(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Foint() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] array = {x,y};
        return array;
    }

    @Override
    public String toString() {
        return "Sc2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
