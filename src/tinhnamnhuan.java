import java.util.Scanner;

public class tinhnamnhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nam");
        int nam = sc.nextInt();
        if(nam % 4 == 0 && nam % 100 != 0){
            System.out.print("day la nam nhuan");
        }
        if(nam % 100 == 0 && nam % 400 != 0){
            System.out.print("day khong phai nam nhuan");
        }
        if(nam % 100 == 0 && nam % 400 == 0){
            System.out.print("day la nam nhuan");
        }
        if(nam % 4 != 0){
            System.out.print("day k phai nam nhuan");
        }
    }
}
