package baitaptrenlop;

import java.util.Arrays;
import java.util.Scanner;

public class gopmang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int [] arr1 = new int[4];
        System.out.print("nhap cac phan tu");
        for (int i = 0 ; i< arr1.length;i++){
            arr1[i]  = sc.nextInt();

    }
        int [] arr2 =new int[4];
        System.out.print("nhap cac phan tu");
        for(int j = 0 ; j< arr2.length;j++){
            arr2[j]= sc.nextInt();
        }
        int [] arr3 = new int[arr1.length+arr2.length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr2.length, arr2.length);
        System.out.print(Arrays.toString(arr3));
}
}