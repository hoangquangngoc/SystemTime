package dethithuchanh;

import java.util.Scanner;

public class Manager {
    canBo[] canBos = {};
    Scanner sc = new Scanner(System.in);


    public void them() {
        System.out.println("nhập tên cán bộ");
        String name = sc.nextLine();
        System.out.println("nhập tuổi");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tinh");
        String gender = sc.nextLine();
        System.out.println("nhập địa chỉ ");
        String adress = sc.nextLine();
        canBo cb = new canBo(name, age, gender, adress);

        canBo[] canBos1 = new canBo[canBos.length + 1];
        for (int i = 0; i < canBos.length; i++) {
            canBos1[i] = canBos[i];

        }
        canBos1[canBos1.length - 1] = cb;
        canBos = canBos1;
    }

    public void timKiem(String name) {
        System.out.println("Nhập name tìm kiếm");
        for (canBo canBo : canBos){
            if (canBo .getName().indexOf(name)>=0){
                System.out.println(canBo);
            }
        }



   }
    public void show() {
        for (int i = 0; i < canBos.length; i++) {
            System.out.println(canBos[i].toString());
        }
    }
    }
