package baitaptrenlop;

import java.util.Scanner;

public class chuyendoinhietdo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit ;
        double Celsius ;
        int choice = 0;
        do {
            System.out.print("Menu: ");
            System.out.print("1. Fahrenheit to Celsius");
            System.out.print("2. Celsius to Fahrenheit");
            System.out.print("0. Exit");
            System.out.print("Enter your choice:");
            switch (choice) {
                case 1: {
                    System.out.println("Enter Fahrenheit : ");
                    fahrenheit= input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " +fahrenheit);
                    break;
                }
                case 2:{
                    System.out.println("Enter Celsius: ");
                    Celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + Celsius);
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double Celsius = (5.0 / 9) * (fahrenheit - 32);
        return Celsius;
    }
}
