package ngay6.baiTH;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Retangle retangle = new Retangle(5,8);
        System.out.println(retangle.getArea());
        System.out.println(retangle.getPerimeter());
    }
}
