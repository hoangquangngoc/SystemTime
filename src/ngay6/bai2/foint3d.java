package ngay6.bai2;

public class foint3d extends Foint {
    private float z = 0f;
    private float x;
    private float y;

    public foint3d(){

    }
    public foint3d(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public float[] getXYZ(){
        float[] array = {x,y,z};
        return array;
    }

    @Override
    public String toString() {
        return "Sc3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}