package org.example;

import java.util.Scanner;

public class Create {
    public static double getTemperatureValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature value to be converted: ");
        double temperatureValue = input.nextDouble();
        return temperatureValue;
    }

}
