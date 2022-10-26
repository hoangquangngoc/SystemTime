package ngay4.taoclassnhanvien;

public class Nhanvien {
    int id;
    String name ;
    int age;
    String adress;
    public Nhanvien(int id,String name,int age, String adress){
        this.id = id;
        this.name = name;
        this.age = age;
        this.adress=adress;
    }

    public String show(){
        return " \ntên là:"+name + " \ntuổi là: " + age + " \nđịa chỉ là: " + adress + " \nid là: " + id;
    }
}
