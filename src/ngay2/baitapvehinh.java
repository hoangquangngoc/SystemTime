package ngay2;

import java.util.Scanner;

public class baitapvehinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        int hinh = sc.nextInt();
        switch (hinh) {
            case 1:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = i; j <= 5; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 6; i >= 1; i--) {
                    for (int j = 1; j < i; j++) {
                        System.out.print("  ");

                    }
                    for (int j = i; j <= 5; j++) {
                        System.out.print(" *  ");
                    }
                    System.out.println("  ");
                }
        }
    }
}
