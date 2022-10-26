package ngay6.baitaptrenlop;

public class Parttime extends quanLi {
    private int songay;
    private int luong1ngay = 120000;

    public Parttime(int songay) {
        this.songay = songay;
    }

    public Parttime(int id, String name, int age, String address, int songay) {
        super(id, name, age, address);
        this.songay = songay;
    }

    public int getSongay() {
        return songay;
    }

    public void setSongay(int songay) {
        this.songay = songay;
    }

    public int tinhLuongParttime() {
        return songay * luong1ngay;
    }

    @Override
    public String toString() {
        return super.toString() + "Parttime{" +
                "songay=" + songay +
                ", luong1ngay=" + luong1ngay+
                '}';
    }



}
