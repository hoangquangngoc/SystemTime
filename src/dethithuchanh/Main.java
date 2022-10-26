package dethithuchanh;

public class Main {
    public static void main(String[] args) {
        congNhan cn = new congNhan();

        System.out.println(new congNhan("abc",14,"yb","yb"));
        System.out.println("công nhân bậc: "+cn.bac());

        kySu ks = new kySu();
        System.out.println(new kySu("xyz",30,"nữ","yen bai"));
        System.out.println("ngành đào tạo: "+ks.nganhDaoTao());

        phucVu pv = new phucVu();
        System.out.println(new phucVu("oyz",40,"nữ","yen bai"));
        System.out.println("công việc: "+pv.congViec());
    }

    }

