package ngay6.bai2;

public class Main {
    public static void main(String[] args) {
        Foint foint = new Foint(1.5f, 3.5f);
        foint.setX(1.6f);
        System.out.println(foint.getX());
        foint.setY(3.6f);
        System.out.println(foint.getY());
        foint.setXY(5.5f, 8.8f);
        float[] arr = foint.getXY();
        for (float a : arr
        ) {
            System.out.println(a + "\t");
        }
        foint3d foint3d = new foint3d();
        foint3d.setX(2.5f);
        System.out.println(foint3d.getX());
        foint3d.setY(3.5f);
        System.out.println(foint3d.getY());
        foint3d.setZ(4.5f);
        System.out.println(foint3d.getZ());
        foint3d.setXYZ();
        float[] arr1 = foint3d.getXYZ();
        for (float b : arr1
        ) {
            System.out.println(b + "\t");
        }
    }
}
