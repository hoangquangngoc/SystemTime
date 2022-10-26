package baitapvenha;

import java.util.Scanner;

public class tinhtrungbinhcong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so thu 1: ");
        int so1 = sc.nextInt();
        System.out.println("nhap so thu 2: ");
        int so2 = sc.nextInt();
        System.out.println("nhap so thu 3: ");
        int so3 = sc.nextInt();
        int tong = (so1 + so2 + so3)/3;
        System.out.println("trung binh cong la: " + tong);
    }
}
