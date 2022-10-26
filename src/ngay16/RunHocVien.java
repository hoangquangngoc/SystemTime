package ngay16;



import java.util.Scanner;

public class RunHocVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerHocVien managerHocVien = new ManagerHocVien();

        System.out.println("----Quan li----");
        System.out.println("1. thêm");
        System.out.println("2. hiển thị nhân viên ");
        System.out.println("3. hiển thị toàn bộ nhân viên theo lớp ");
        while (true){
        int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    managerHocVien.them();
                    break;
                case 2:
                    managerHocVien.hienthi();
                    break;
            }
        }


    }
}
