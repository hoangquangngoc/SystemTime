package ngay14.baitaptrenlop;

public class Phuongtiengiaothong {
    private int id;
    private String hangsanxuat;
    private int namsanxuat;
    private double giaban;
    private String color;

    public Phuongtiengiaothong() {
    }

    public Phuongtiengiaothong(int id, String hangsanxuat, int namsanxuat, double giaban, String color) {
        this.id = id;
        this.hangsanxuat = hangsanxuat;
        this.namsanxuat = namsanxuat;
        this.giaban = giaban;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(String hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    public int getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(int namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phuongtiengiaothong{" +
                "id=" + id +
                ", hangsanxuat='" + hangsanxuat + '\'' +
                ", namsanxuat=" + namsanxuat +
                ", giaban=" + giaban +
                ", color='" + color + '\'';
    }
}
