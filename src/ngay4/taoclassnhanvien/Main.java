package ngay4.taoclassnhanvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhap name");
        String name = sc.nextLine();
        System.out.println("nhap dia chi");
        String adress = sc.nextLine();
        System.out.println("nhap age");
        int age = sc.nextInt();

        Nhanvien nv = new Nhanvien(id,name,age,adress);
        System.out.println(nv.show());
    }
}
