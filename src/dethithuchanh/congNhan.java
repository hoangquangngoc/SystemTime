package dethithuchanh;

public class congNhan extends canBo{
    public congNhan() {
    }

    public congNhan(String name, int age, String gender, String adress) {
        super(name, age, gender, adress);
    }
    public int bac(){
        return 3;

    }

    @Override
    public String toString() {
        return super.toString()+"congNhan{}";
    }
}
