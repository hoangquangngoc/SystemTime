package ngay2;

import java.util.Scanner;

public class hienthi20snt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("kiem tra snt");
        int numbers = sc.nextInt();
        System.out.println("Display "+numbers + " primes: ");
        int count = 0;
        int number =2;
        while (count<numbers){
            boolean check = true;
            for (int i =2 ; i<=Math.sqrt(number);i++){
                if (number%i==0 ){
                    check = false;
                    break;

                }
            }
            if (check){
                System.out.print(number+"\t");
                count++;
            }
            number++;
        }
    }
}
