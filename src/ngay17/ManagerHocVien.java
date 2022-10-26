package ngay17;

import ngay16.IOHocVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ManagerHocVien {
    ArrayList<HocVien>hocViens = IONhi_Phan.read();

    ArrayList<Lop> lops =  IOLopNhi_Phan.read();

    Scanner sc = new Scanner(System.in);
    public ManagerHocVien(){
        lops.add(new Lop(1,"C0722g1"));
        lops.add(new Lop(2,"2ygeyd"));
        lops.add(new Lop(3,"234ddg"));
    }
    public void input(){
        System.out.println("Nhập name học viên");
        String name = sc.nextLine();
        System.out.println("Nhập gender học viên");
        String gender = sc.nextLine();
        System.out.println("Nhập age học viên");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập phone học viên");
        String phone = sc.nextLine();
        Date date = null;
        while (true) {
            System.out.println("Nhập birthDay học viên theo định dạng dd/MM/yyyy");
            String birthday = sc.nextLine();
            try {
                date = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
                break;
            } catch (ParseException e) {
                System.out.println("Sai định dạng");

            }
        }

        for (int i = 0; i < lops.size(); i++) {
            System.out.println(i + 1 + " : " + lops.get(i).getName());
        }
        System.out.println("Mời bạn chọn lớp theo thứ tự");
        int choice = Integer.parseInt(sc.nextLine());
        Lop lop = lops.get(choice - 1);

        HocVien hocVien = new HocVien(name, gender, age, phone, date, lop);
        hocViens.add(hocVien);
        show();
        IONhi_Phan.write(hocViens);

        }


    public void show(){
        for (HocVien hv:hocViens) {
            System.out.println(hv.toString());
        }
    }
    public void showLop(){
        int idlop = 0;
        while (true || idlop < 0){
            System.out.println("nhập id lớp");
            try {
                idlop = Integer.parseInt(sc.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("nhập lại id >0");
            }
        }
        for (HocVien hv:hocViens) {
           if (idlop == hv.getLop().getId()){
               System.out.println(hv);
               break;
           }
        }
    }
}
