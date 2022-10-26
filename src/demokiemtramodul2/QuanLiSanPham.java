package demokiemtramodul2;

import java.io.Serializable;

public class QuanLiSanPham implements Serializable {
    private int masanpham;
    private String tensanpham;
    private double gia;
    private int soluong;
    private String mota;

    public QuanLiSanPham() {
    }

    public QuanLiSanPham(int masanpham, String tensanpham,double gia, int soluong, String mota) {
        this.masanpham = masanpham;
        this.tensanpham = tensanpham;
        this.gia = gia;
        this.soluong = soluong;
        this.mota = mota;

    }

    public int getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(int masanpham) {
        this.masanpham = masanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }
    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia= gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    @Override
    public String toString() {
        return "QuanLiSanPham{" +
                "masanpham=" + masanpham +
                ", tensanpham='" + tensanpham + '\'' +
                ", gia=" + gia +
                ", soluong=" + soluong +
                ", mota='" + mota + '\'' +
                '}';
    }


}
