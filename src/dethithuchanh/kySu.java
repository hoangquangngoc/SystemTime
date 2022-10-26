package dethithuchanh;

public class kySu extends canBo{
    public kySu() {
    }

    public kySu(String name, int age, String gender, String adress) {
        super(name, age, gender, adress);
    }
    public String nganhDaoTao(){
        return "thiết kê ";
    }

    @Override
    public String toString() {
        return super.toString()+"kySu{}";
    }
}
