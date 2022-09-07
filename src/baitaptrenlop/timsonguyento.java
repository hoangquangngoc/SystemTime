package baitaptrenlop;



public class timsonguyento {
    public static void main(String[] args) {


        int [] arr = {2,3,7,11,17,19,21,23};
        for ( int i = 0 ; i< arr.length;i++){
            boolean check = true;
            if (arr[i]< 2 ){
                check = false;
            }
            else if (arr[i]>2){
                for(int j =2 ;j< arr[i];j++){
                    if (arr[i]%j==0){
                        check =false;
                        break;
                    }

                    }
                } if(check){
                    System.out.println(arr[i] + "la so nguyen to");
            }
        }
    }
}
