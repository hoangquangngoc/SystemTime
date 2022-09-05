import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        double usd ;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so tien USD");
         usd = sc.nextDouble();
         double quydoi = usd * 23000;
         System.out.print("gia tri vnd" + quydoi);
    }
}
