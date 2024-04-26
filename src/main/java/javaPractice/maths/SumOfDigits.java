package javaPractice.maths;

import java.util.Scanner;

public class SumOfDigits {

    /*
        Sum of Digits: Write a Java program to find the sum of digits of a given number.
        For Example; 32541 --> result = 15
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        getSumOfDigits(number);

        scanner.close();
    }

    //Count Method
    public static void getSumOfDigits(int number){

        int counter = 0;

        for (int i = number; i>0; i=i/10){
            counter += (i % 10);
        }

        System.out.println("The number of digits = " + counter);
    }
}