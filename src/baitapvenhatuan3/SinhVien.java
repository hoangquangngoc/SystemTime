package baitapvenhatuan3;

public class SinhVien {
    private String name;
    private int mahocvien;
    private int ngaysinh;
    private int lop;

    public SinhVien() {
    }

    public SinhVien(String name, int mahocvien, int ngaysinh, int lop) {
        this.name = name;
        this.mahocvien = mahocvien;
        this.ngaysinh = ngaysinh;
        this.lop = lop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMahocvien() {
        return mahocvien;
    }

    public void setMahocvien(int mahocvien) {
        this.mahocvien = mahocvien;
    }

    public int getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(int ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", mahocvien=" + mahocvien +
                ", ngaysinh=" + ngaysinh +
                ", lop=" + lop +
                '}';
    }
}
