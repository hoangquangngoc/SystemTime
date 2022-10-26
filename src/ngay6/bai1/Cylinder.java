package ngay6.bai1;

public class Cylinder extends Circle{

    private int chieucao;


    public Cylinder(double banKinh, String color, int chieucao) {
        super(banKinh, color );
        this.chieucao = chieucao;

    }

    public int getChieucao() {

        return chieucao;
    }

    public void setChieucao(int chieucao) {

        this.chieucao = chieucao;
    }


    public void tinhTheTich(){
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "chieucao=" + chieucao +
                '}';
    }
}

