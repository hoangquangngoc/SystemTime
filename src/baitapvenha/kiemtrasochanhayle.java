package baitapvenha;

import java.util.Scanner;

public class kiemtrasochanhayle {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("nhap so de kiem tra");
        int so = sc.nextInt();
        for(int i =0 ;i< so;i++){
            if(so% 2 ==0){
                System.out.println("đây là số chẵn ");
                break;
            }
            else {
                System.out.println("đây laf số lẻ ");
                break;
            }
        }
    }
}
