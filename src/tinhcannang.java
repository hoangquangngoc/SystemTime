import java.util.Scanner;

public class tinhcannang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap weight 'kg'");
        double weight = sc.nextDouble();
        System.out.print("nhap height 'm'");
        double height = sc.nextDouble();
        double bmi = weight / Math.pow(height,2);
        System.out.print("chi so bmi la " + bmi );
        if(bmi<18){
            System.out.print("\t thieu can");
        }
        else if(bmi<25.0){
            System.out.print("\t binh thuong");
        }
        else if(bmi<30.0){
            System.out.print("\t thua can");
        }
        else{
            System.out.print("\t beo phi");
        }
    }
}
