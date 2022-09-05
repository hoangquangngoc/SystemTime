import java.util.Scanner;

public class tinhsongay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("so ngay cua cac thang");
        int month = sc.nextInt();
        switch (month){
            case 2:
                System.out.println("so ngay thang '2' là 28,29 ngay");
                break;
            case 1,3,5,7,8,10,12:
                System.out.println("so thang" + month + " co 31 days!");
                break;
            case 4,6,9,11:
                System.out.println("thang" + month+"co 30 ngay");
                break;
        }
    }
}
