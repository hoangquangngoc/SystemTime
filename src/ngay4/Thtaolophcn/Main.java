package ngay4.Thtaolophcn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chiều rộng: ");
        double width = sc.nextDouble();
        System.out.print("nhập chiều dài: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("hình chữ nhật là \n "+ rectangle.display());
        System.out.println("chu vi hinh chữ nhật là \n" + rectangle.getPerimeter());
        System.out.println("diện tích hình chữ nhật là \n" + rectangle.getArea());
    }
}
