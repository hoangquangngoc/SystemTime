package ngay14.baitaptrenlop;

public class Xemay extends Phuongtiengiaothong{
    private int congxuat;

    public Xemay() {
    }

    public Xemay(int congxuat) {
        this.congxuat = congxuat;
    }

    public Xemay(int id, String hangsanxuat, int namsanxuat, double giaban, String color, int congxuat) {
        super(id, hangsanxuat, namsanxuat, giaban, color);
        this.congxuat = congxuat;
    }

    public int getCongxuat() {
        return congxuat;
    }

    public void setCongxuat(int congxuat) {
        this.congxuat = congxuat;
    }

    @Override
    public String toString() {
        return super.toString() +
                "congxuat=" + congxuat ;
    }
}
