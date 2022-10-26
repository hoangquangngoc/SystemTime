package ngay7.bai1;

public class Square implements IResizeable{
    private double canh;

    public Square() {
    }

    public Square(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
    public double getArea(){
        return canh*canh;
    }


    @Override
    public void resize(double percent) {
        canh *= (1+percent/100);
    }
}
