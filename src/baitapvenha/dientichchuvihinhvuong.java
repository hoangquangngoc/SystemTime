package baitapvenha;

import java.util.Scanner;

public class dientichchuvihinhvuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập canh cua hinh vuông: ");
        int canh = sc.nextInt();
        int chuvi = canh * 4;
        System.out.println("chu vi cua hinh vuong la: "+ chuvi);
        int dientich = canh*canh;
        System.out.println("dien tich cua hinh vuong la: "+dientich );
    }
}
