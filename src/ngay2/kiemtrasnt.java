package ngay2;

import java.util.Scanner;

public class kiemtrasnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so: ");
        int so = sc.nextInt();

     if(so < 2){
         System.out.print(so + "day khong la so nguyen to");
     }else {
         int i = 2;
         boolean check = true;
         while (i<Math.sqrt(so)){
             if(so % 2 ==0){
                 check =false;
                 break;
             }
             i++;
         }
         if(check){
             System.out.print(so + "day la so nguyeno");
         }else
             System.out.print(so+ "day khong phai so nguyen to");
        }
    }
}
