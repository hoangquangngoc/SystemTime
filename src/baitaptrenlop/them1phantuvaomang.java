package baitaptrenlop;

import java.util.Arrays;
import java.util.Scanner;

public class them1phantuvaomang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[6];
        System.out.print("nhap cac phan tu");
        for (int i = 0 ; i< arr.length;i++){
            arr[i]  = sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        int [] arr2 = new int [arr.length + 1];
        System.out.print("nhap vi tri can them");
        int index = sc.nextInt();
        System.out.print("nhap so muon them");
        int a = sc.nextInt();
        for (int i =0 ; i< arr2.length;i++){
            if (i< index){
                arr2[i]=arr[i];
            }
            else if (i == index){
                arr2[i]=a;
            }
            else {
                arr2[i]= arr[i-1];
            }

        }
        System.out.print(Arrays.toString(arr2));
        }
    }



