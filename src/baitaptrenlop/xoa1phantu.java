package baitaptrenlop;

import java.util.Arrays;
import java.util.Scanner;

public class xoa1phantu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("nhap các phan tu");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            int[] arr2 = new int[arr.length - 1];
            System.out.print("chọn vị trí cần xóa");
            int index = sc.nextInt();
            for (int i = 0; i < arr2.length; i++) {
                if (i < index) {
                    arr2[i] = arr[i];
                } else {
                    arr2[i] = arr[i + 1];

                }
            }
            System.out.println(Arrays.toString(arr2));
        }
    }

