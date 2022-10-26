package ngay7.bai1;

import ngay7.bai2.Square;

public class Main {
    public static void main(String[] args) {
        Circle circle =new Circle(5);
        System.out.println(circle.getArea());
        circle.resize(5);
        System.out.println(circle.getRadius());




        Rectangle rectangle = new Rectangle(5,10);
        System.out.println(rectangle.getArea());
        rectangle.resize(10);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());


        Square square = new Square(5);
        System.out.println(square.getArea());

    }
}
