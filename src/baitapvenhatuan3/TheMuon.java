package baitapvenhatuan3;

public class TheMuon extends SinhVien{
    private int sothemuon;
    private int ngaymuon;
    private int hantra;
    private int sohieusach;

    public TheMuon() {
    }

    public TheMuon(int sothemuon, int ngaymuon, int hantra, int sohieusach) {
        this.sothemuon = sothemuon;
        this.ngaymuon = ngaymuon;
        this.hantra = hantra;
        this.sohieusach = sohieusach;
    }

    public TheMuon(String name, int mahocvien, int ngaysinh, int lop, int sothemuon, int ngaymuon, int hantra, int sohieusach) {
        super(name, mahocvien, ngaysinh, lop);
        this.sothemuon = sothemuon;
        this.ngaymuon = ngaymuon;
        this.hantra = hantra;
        this.sohieusach = sohieusach;
    }

    public int getSothemuon() {
        return sothemuon;
    }

    public void setSothemuon(int sothemuon) {
        this.sothemuon = sothemuon;
    }

    public int getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(int ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public int getHantra() {
        return hantra;
    }

    public void setHantra(int hantra) {
        this.hantra = hantra;
    }

    public int getSohieusach() {
        return sohieusach;
    }

    public void setSohieusach(int sohieusach) {
        this.sohieusach = sohieusach;
    }

    @Override
    public String toString() {
        return toString()+"TheMuon{" +
                "sothemuon=" + sothemuon +
                ", ngaymuon=" + ngaymuon +
                ", hantra=" + hantra +
                ", sohieusach=" + sohieusach +
                '}';
    }
}
