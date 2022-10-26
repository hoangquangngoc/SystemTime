package ngay14.baitaptrenlop;

import java.util.Scanner;

public class MainQLPTGT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLPTGT qlptgt = new QLPTGT();
        while (true) {
            System.out.println("-----Chương trình quản lí sản phẩm-----");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Thêm loại xe muốn thêm");
            System.out.println("2. hiển thị");
            System.out.println("3. xóa");
            System.out.println("4. sửa");
            System.out.println("5. Sắp xếp");
            System.out.println("6. tìm kiếm");
            System.out.println("7. Thoát ");


            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    qlptgt.cacPhuongTien();
                    break;
                case 2:
                    qlptgt.hienthi();
                    break;
                case 3:
                    qlptgt.xoa();
                    break;
                case 4:
                    qlptgt.sua();
                    break;
                case 5:
                    qlptgt.sapxep();
                    break;
                case 6:
                    qlptgt.timKiem();
                    break;
                case 7:
                    return;

            }
        }
    }
}