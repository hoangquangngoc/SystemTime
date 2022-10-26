package ngay14.baitaptrenlop;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QLPTGT {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Phuongtiengiaothong> phuongtien = new ArrayList<>();

    public Oto taoOto() {
        System.out.println("nhập id ô tô");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập hãng ô tô");
        String hangsanxuat = sc.nextLine();
        System.out.println("nhập năm sản xuất");
        int namsanxuat = Integer.parseInt(sc.nextLine());
        System.out.println("nhập gia bán");
        double giaban = Double.parseDouble(sc.nextLine());
        System.out.println("nhập màu sắc");
        String color = sc.nextLine();
        System.out.println("số chỗ ngồi ");
        int sochongoi = Integer.parseInt(sc.nextLine());
        System.out.println("kiểu động cơ");
        String kieudongco = sc.nextLine();
        Oto oto = new Oto(id, hangsanxuat, namsanxuat, giaban, color, sochongoi, kieudongco);
        return oto;
    }

    public Xemay taoXemay() {
        System.out.println("nhập id xe máy");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập hãng xe máy");
        String hangsanxuat = sc.nextLine();
        System.out.println("nhập năm sản xuất");
        int namsanxuat = Integer.parseInt(sc.nextLine());
        System.out.println("nhập gia bán");
        double giaban = Double.parseDouble(sc.nextLine());
        System.out.println("nhập màu sắc");
        String color = sc.nextLine();
        System.out.println("nhập công xuất");
        int congxuat = Integer.parseInt(sc.nextLine());
        Xemay xemay = new Xemay(id, hangsanxuat, namsanxuat, giaban, color, congxuat);
        return xemay;
    }

    public Xetai taoXetai() {
        System.out.println("nhập id xe tải");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập hãng xe tải");
        String hangsanxuat = sc.nextLine();
        System.out.println("nhập năm sản xuất");
        int namsanxuat = Integer.parseInt(sc.nextLine());
        System.out.println("nhập gia bán");
        double giaban = Double.parseDouble(sc.nextLine());
        System.out.println("nhập màu sắc");
        String color = sc.nextLine();
        System.out.println("nhập trọng tải");
        int trongtai = Integer.parseInt(sc.nextLine());
        Xetai xetai = new Xetai(id, hangsanxuat, namsanxuat, giaban, color, trongtai);
        return xetai;
    }
    void cacPhuongTien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Bạn muốn chọn loại nào-----");
        System.out.println("1: nhập ô tô");
        System.out.println("2: nhập xe máy");
        System.out.println("3: nhập xe tải");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                phuongtien.add(taoOto());
                break;
            case 2:
                phuongtien.add(taoXemay());
                break;
            case 3:
                phuongtien.add(taoXetai());
                break;
        }
    }


    Read_Write1 read_write1 = new Read_Write1();
    public void hienthi() {
        for (Phuongtiengiaothong pt : phuongtien) {
            System.out.println(pt);
        }
        read_write1.write(phuongtien);
    }

    public boolean xoa() {
        System.out.println("nhập id muốn xóa");
        int id = Integer.parseInt(sc.nextLine());
        for (Phuongtiengiaothong pt : phuongtien) {
            if (pt.getId() == id) {
                phuongtien.remove(pt);
                return true;
            }
        }
        return false;
    }
    public void sua(){


            System.out.println("nhập vị trí phương tiện cần sửa");
            System.out.println("1: sửa ô tô");
            System.out.println("2: sửa xe máy");
            System.out.println("3: sửa xe tải");
            int index = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < phuongtien.size(); i++) {
            switch ( index) {
                case 1:
                Oto oto = taoOto();
                phuongtien.set(i, oto);
                break;
                case 2:
                Xemay xemay = taoXemay();
                phuongtien.set(i , xemay);
                break;
                case 3:
                Xetai xetai = taoXetai();
                phuongtien.set(i,xetai);
                break;
                }
            }
        }

    public void sapxep(){
        phuongtien.sort(new Comparator<Phuongtiengiaothong>() {
            @Override
            public int compare(Phuongtiengiaothong o1, Phuongtiengiaothong o2) {
                return o1.getId()-o2.getId();
            }
        });
        for (int i = 0; i< phuongtien.size();i++){
            System.out.println(phuongtien.get(i));
        }
    }
    public void timTheohangSanXuat(){
        System.out.println("tìm kiếm xe theo hãng");
        String hangxe = sc.nextLine();
        for (Phuongtiengiaothong pt:phuongtien) {
            if(pt.getHangsanxuat() .equals(hangxe)){
                System.out.println(pt);
            }

        }

    }
    public void timkiemtheomau(){
        System.out.println("tìm kiếm xe theo màu");
        String mauxe = sc.nextLine();
        for (Phuongtiengiaothong pt:phuongtien) {
            if(pt.getColor().equals(mauxe)){
                System.out.println(pt);
            }
        }
    }
    public void timKiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Tìm kiếm theo hãng");
        System.out.println("2: Tìm kiếm theo màu");
        int chon = Integer.parseInt(sc.nextLine());
        switch (chon){
            case 1:
                timTheohangSanXuat();
            case 2:
                timkiemtheomau();
        }
    }
}