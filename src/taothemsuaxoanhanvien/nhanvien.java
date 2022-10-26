package taothemsuaxoanhanvien;

import java.util.Arrays;
import java.util.Scanner;

public class nhanvien {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6 };
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.show mang so");
            System.out.println("2.thêm số vào mảng");
            System.out.println("3.sửa số trong mảng");
            System.out.println("4.xóa số trong mảng ");
            System.out.println("0.thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Nhap so muon them vao cuoi mang so");
                    int a = Integer.parseInt(sc.nextLine());
                    int[] arr1 = new int[arr.length + 1];
                    for (int i = 0; i < arr.length; i++) {
                        arr1[i] = arr[i];
                    }
                    arr1[arr1.length - 1] = a;


                    System.out.println("mảng mới là: " + Arrays.toString(arr1));
                    break;
                case 3:
//                    System.out.println("nhập vị trí cần sửa");
//                    int index = Integer.parseInt(sc.nextLine());
//                    System.out.println("nhập số thay vaof vị trí");
//                    int b = Integer.parseInt(sc.nextLine());
//                    for (int i = 0; i < arr.length; i++) {
//                        if (i == index) {
//                            arr[i] = b;
//                        }
//                    }
//                    System.out.println("mảng sau khi sửa là " + Arrays.toString(arr));
//                    break;
                    System.out.println("nhập vị trí cần sửa");
                    int index= Integer.parseInt(sc.nextLine());
                    System.out.println("nhập số thay vào ");
                    int value= Integer.parseInt(sc.nextLine());
                    arr[index]=value;

                case 4:
                    System.out.println("nhập vị trí muốn xóa khỏi mảng ");
                    int index1 = Integer.parseInt(sc.nextLine());
                    int[] arr2 = new int[arr.length - 1];

                    for (int i = 0; i < arr2.length; i++) {
                        if (i >= index1) {
                            arr2[i] = arr[i + 1];
                        } else {
                            arr2[i] = arr[i];
                        }
                    }
                    arr = arr2;
                    System.out.println("mảng sau khi xóa là " + Arrays.toString(arr2));
                    break;
                case 5:
                    System.exit(0);

            }
        }
    }
}






