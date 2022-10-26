package baitapvenhatuan3;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    Scanner sc = new Scanner(System.in);
    private ArrayList<SinhVien> quanli;

    public Manager() {
    }

    public Manager(Scanner sc, ArrayList<SinhVien> quanli) {
        this.sc = sc;
        this.quanli = quanli;
    }
    public void them(SinhVien sv){
        this.quanli.add(sv);
    }
    public SinhVien creatsinhvien(){
        System.out.println("tên sinh viên");
        String name = sc.nextLine();
        System.out.println("mã học viên");
        int MHV = Integer.parseInt(sc.nextLine());
        System.out.println("ngày sinh");
        int NS = Integer.parseInt(sc.nextLine());
        System.out.println("lớp");
        int Lop = Integer.parseInt(sc.nextLine());

       SinhVien sinhVien = new SinhVien(name,MHV,NS,Lop);
       return sinhVien;
    }


}
