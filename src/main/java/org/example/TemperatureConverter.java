package org.example;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("-------------------------------------");
        double temperatureValue = Create.getTemperatureValue();
        int conversionChoice = Create.getConversionChoice();
        double convertedValue;
        String fromUnit, toUnit;
        if (conversionChoice == 1) {
            convertedValue = Update.fahrenheitToCelsius(temperatureValue);
            fromUnit = "Fahrenheit";
            toUnit = "Celsius";
        } else if (conversionChoice == 2) {
            convertedValue = Update.celsiusToFahrenheit(temperatureValue);
            fromUnit = "Celsius";
            toUnit = "Fahrenheit";
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
            return;
        }
        Read.outputResult(temperatureValue, convertedValue, fromUnit, toUnit);
    }

}

