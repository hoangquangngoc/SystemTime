package ngay14.baitaptrenlop;

public class Xetai extends Phuongtiengiaothong{
    private int trongtai;

    public Xetai() {
    }

    public Xetai(int trongtai) {
        this.trongtai = trongtai;
    }

    public Xetai(int id, String hangsanxuat, int namsanxuat, double giaban, String color, int trongtai) {
        super(id, hangsanxuat, namsanxuat, giaban, color);
        this.trongtai = trongtai;
    }

    public int getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(int trongtai) {
        this.trongtai = trongtai;
    }

    @Override
    public String toString() {
        return super.toString() +
                "trongtai=" + trongtai ;
    }
}
