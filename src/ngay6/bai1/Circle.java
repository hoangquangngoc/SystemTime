package ngay6.bai1;

public class Circle {
 private double banKinh;
    private String color;


    public Circle(double banKinh, String color) {
        this.banKinh = banKinh;
        this.color = color;

    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public void banKinh() {
        System.out.println(banKinh);
    }
    public double dienTich(){
        return Math.PI*banKinh*banKinh ;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "banKinh=" + banKinh +
                ", color='" + color + '\'' +
                '}';
    }
}
