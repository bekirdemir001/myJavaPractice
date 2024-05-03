package javaPractice.other_practices;

import java.util.Scanner;

public class TemperatureConverter {

    /*
    Temperature Converter: Write a Java program to convert temperature from Celsius to Fahrenheit and vice versa.
    Hint; Fahrenheit = (Celsius * 1.8) + 32
          Celsius = (Fahrenheit - 32) / 1.8
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a grad");
        double temp = scanner.nextDouble();

        temperatureConverter(temp);
    }

    //Create a method converts temperature from Celsius to Fahrenheit and vice versa.
    public static void temperatureConverter(double temp){

        double celsius;
        double fahrenheit;

        fahrenheit = (temp * 1.8) + 32;
        celsius = (temp - 32) / 1.8;

        System.out.println("Celsius to Fahrenheit = " + fahrenheit);
        System.out.println("Fahrenheit to Celsius = " + celsius);
    }

}