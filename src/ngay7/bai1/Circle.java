package ngay7.bai1;

public class Circle implements IResizeable{
    private double radius ;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public void resize(double percent) {
        radius *= (1+percent/100);

    }
}
