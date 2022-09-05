
import java.util.Scanner;

public class giaiphuongtrinh {
    public static void main(String[] args) {
        System.out.println("giai phuong trinh");
        System.out.println("cong thuc 'ax+b=c' , nhap hang so :");
        Scanner sc = new Scanner(System.in);
        System.out.print("a:");
        double a = sc.nextDouble();
        System.out.print("b:");
        double b = sc.nextDouble();
        System.out.print("c:");
        double c = sc.nextDouble();
        if(a!=0){
            double answer = (c - b) / a;
            System.out.println(answer);
        }
        else {
            if(b==c){
                System.out.println("phuong trinh vo so nghiem");
            }
            else {
                System.out.println("phuong trinh vo nghiem");
            }
        }
    }
}
