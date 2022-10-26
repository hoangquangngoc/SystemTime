package ngay4.xaydunglopptbac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double a, b ,c;
        System.out.println("nhập 3 số a,b,c");
        Scanner kq = new Scanner(System.in);
        a= kq.nextDouble();
        b= kq.nextDouble();
        c= kq.nextDouble();
        ptbac2 total = new ptbac2(a,b,c);
        if(total.delta()<0){
            System.out.println("phương trình không có nghiệm");
        }else if(total.delta()==0){
            System.out.println("phương trình có 1 nghiệm duy nhất"+total.nghiem1());
        }else {
            System.out.println("nghiệm 1 "+total.nghiem1());
            System.out.println("nghiệm 2 "+total.nghiem2());
        }
    }
}
