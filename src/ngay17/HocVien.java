package ngay17;

import java.io.Serializable;
import java.util.Date;

public class HocVien implements Serializable {
    private static final long serialVersionUID = 2906642554793891381L;
    private String name;
    private int age;
    private String gender;
    private String phone;
    private Date birirthday;
    private Lop lop;

    public HocVien(String name, String gender, int age, String phone, Date date, Lop lop) {
    }

    public HocVien(String name, int age, String gender, String phone, Date birirthday, Lop lop) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.birirthday = birirthday;
        this.lop = lop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirirthday() {
        return birirthday;
    }

    public void setBirirthday(Date birirthday) {
        this.birirthday = birirthday;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "HocVien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", birirthday=" + birirthday +
                ", lop=" + lop +
                '}';
    }
}
