import java.util.Scanner;

public class chuyensothanhchu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so ");
        int so = sc.nextInt();
        switch (so){
            case 1:
                System.out.print("một");
                break;
            case 2:
                System.out.print("hai");
                break;
            case 3:
                System.out.print("ba");
                break;
            case 4:
                System.out.print("bốn");
                break;
            case 5:
                System.out.print("năm");
                break;
            case 6:
                System.out.print("sáu");
                break;
            case 7:
                System.out.print("bẩy");
                break;
            case 8:
                System.out.print("tám");
                break;
            case 9:
                System.out.print("chín");
                break;
            case 10:
                System.out.print("mười");
                break;
        }
    }
}
