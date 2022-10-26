package ngay4.xaydunglopstopwatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();

        stopWatch.end();
        System.out.println(stopWatch.getStartTime());
        System.out.println(stopWatch.getEndTime());
    }
}
