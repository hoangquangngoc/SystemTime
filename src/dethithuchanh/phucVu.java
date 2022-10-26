package dethithuchanh;

public class phucVu extends canBo{

    public phucVu() {
    }

    public phucVu(String name, int age, String gender, String adress) {
        super(name, age, gender, adress);
    }
    public String congViec(){
        return "chạy bàn";

    }

    @Override
    public String toString() {
        return super.toString()+"phucVu{}";
    }
}
