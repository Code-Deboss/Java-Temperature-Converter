package org.example;

import java.util.Scanner;

public class Create {
    public static double getTemperatureValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature value to be converted: ");
        double temperatureValue = input.nextDouble();
        return temperatureValue;
    }
    public static int getConversionChoice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which conversion would you like to do?");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = input.nextInt();
        return choice;
    }
}
