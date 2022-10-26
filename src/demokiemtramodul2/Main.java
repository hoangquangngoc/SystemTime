package demokiemtramodul2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Manager manager = new Manager();
        while (true){
            System.out.println("-----Chương trình quản lí sản phẩm-----");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Thêm");
            System.out.println("2. Xem danh sách ");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Sắp xếp");
            System.out.println("6. Tim sản phẩm có giá đắt nhất");
            System.out.println("7. Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập mã sản phẩm");
                    int msp = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên sản phẩm");
                    String tsp = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm");
                    double gsp = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập số lượng sản phẩm");
                    int slsp = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập mô tả");
                    String mota = sc.nextLine();
                    QuanLiSanPham Quanli = new QuanLiSanPham(msp,tsp,gsp,slsp,mota);
                    manager.themSanPham(Quanli);

                    break;
                case 2:
                   manager.xemDanhSach();
                    break;
                case 3:
                    manager.sua();
                    break;
                case 4:
                    manager.xoa();
                    break;
                case 5:
                    manager.sapxep();
                    break;
                case 6:
                    manager.timkiem();
                    break;
                case 7:
                    return;
            }
        }
    }
}
