package dethithuchanh;

import java.util.Scanner;

public class MainManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        while (true) {
            System.out.println("Quản Lí Cán Bộ");
            System.out.println("1. Thêm thông tin mới cho cán bộ ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị thông tin cán bộ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:

                    manager.them();
                    break;
                case 2:

                    manager.timKiem("name1");
                    break;
                case 3:

                    manager.show();
                    break;
            }
        }
    }
}

