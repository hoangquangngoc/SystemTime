package ngay4.taoLopFan;

public class runLopFan {
    public static void main(String[] args) {
        lopFan f1 = new lopFan(3 ,true,10,"yellow");
        lopFan f2 = new lopFan();
        f2.setColor("red");
        System.out.println(f2);
    }
}
