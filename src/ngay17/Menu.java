package ngay17;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerHocVien managerHocVien = new ManagerHocVien();
        while (true){
        System.out.println("Menu");
        System.out.println("1. thêm");
        System.out.println("2. hiển thị");
        System.out.println("3. hiển thị theo lơp");
        int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    managerHocVien.input();

                    break;
                case 2:
                    managerHocVien.show();
                    break;
                case 3:
                    managerHocVien.showLop();
                    break;
            }
        }
    }
}
