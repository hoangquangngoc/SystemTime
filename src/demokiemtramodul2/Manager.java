package demokiemtramodul2;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Manager {


    ArrayList<QuanLiSanPham> Quanli = new ArrayList<>();
    Scanner sc = new Scanner(System.in);





    public Manager() {
        this.Quanli = new ArrayList<QuanLiSanPham>();
    }

    public Manager(ArrayList<QuanLiSanPham> Quanli) {
        this.Quanli = Quanli;
    }

    public void themSanPham(QuanLiSanPham ql) {
        this.Quanli.add(ql);
        IOProduct.write(Quanli);

    }

    public void xemDanhSach() {

        for (int i = 0; i < Quanli.size(); i++) {
            System.out.println(Quanli.get(i).toString());
        }
    }

    public void sua() {
        System.out.println("nhập vị trí sản phẩm cần sửa");
        int index = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < Quanli.size(); i++) {
            if (i == index) {
                QuanLiSanPham quanLiSanPham = creatsanpham();
                Quanli.set(i, quanLiSanPham);
            }
        }
        IOProduct.write(Quanli);


    }

    public QuanLiSanPham creatsanpham() {
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
        QuanLiSanPham Quanli = new QuanLiSanPham(msp, tsp, gsp, slsp, mota);
        return Quanli;
    }

    public void xoa() {
        System.out.println("nhập vị trí cần xóa");
        int index = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < Quanli.size(); i++) {
            if (i == index) {
                Quanli.remove(i);
            }
        }
        IOProduct.write(Quanli);
    }

    public void sapxep() {
        Quanli.sort(new Comparator<QuanLiSanPham>() {
            @Override
            public int compare(QuanLiSanPham o1, QuanLiSanPham o2) {
                return o1.getMasanpham() - o2.getMasanpham();
            }

        });
        for (int i = 0; i < Quanli.size(); i++) {
            System.out.println(Quanli.get(i));
        }
    }

    public void timkiem() {
        double max = 0;
        for (int i = 0; i < Quanli.size(); i++) {
            if (Quanli.get(i).getGia() > max) {
                max = Quanli.get(i).getGia();
            }
        }
        for (int i = 0; i < Quanli.size(); i++) {
            if (Quanli.get(i).getGia() == max) {
                System.out.println(Quanli.get(i));
            }
        }
        IOProduct.write(Quanli);
    }

}



