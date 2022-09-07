package baitaptrenlop;

import java.util.Arrays;

public class daonguocmang {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int dao = 0;
        int lap = arr.length-1;
        while (dao<lap){
            int b=arr[dao];
            arr[dao] = arr[lap];
            arr[lap]=b;
            dao++;
            lap--;
        }
        System.out.print(Arrays.toString(arr));

    }
}
