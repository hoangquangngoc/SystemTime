package baitapvenha;

import java.util.Scanner;

public class dientichhinhchunhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều dai: ");
        int chieudai = sc.nextInt();
        System.out.println("nhập chiều rộng: ");
        int chieurong= sc.nextInt();
        int dientich = chieudai * chieurong;
        System.out.println("diện tích hinnh chữ nhat là: " + dientich);
    }
}
