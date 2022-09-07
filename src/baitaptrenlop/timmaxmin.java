package baitaptrenlop;

public class timmaxmin {
    public static void main(String[] args) {
        int [] arr = {3 ,6,78,56,9,7,5,11,23};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0 ;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.print("max : " + max );
        System.out.print("min : "+min);
    }
}
