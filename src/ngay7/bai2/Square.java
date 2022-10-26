package ngay7.bai2;

public class Square implements IColorable{
    private int canh = 4;

    public Square() {
    }

    public Square(int canh) {
        this.canh = canh;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }
    public double getArea(){
        return canh*canh;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
