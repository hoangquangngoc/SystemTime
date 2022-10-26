package baitapvenhatuan3;


import dethithuchanh.Manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        while (true) {
            System.out.println("Quản lí thư viện");
            System.out.println("1.Nhập danh sách sinh viên");
            System.out.println("2.hiển thị danh sách sinh viên");

            int choice= Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                manager.them();

            }
        }
    }
}

