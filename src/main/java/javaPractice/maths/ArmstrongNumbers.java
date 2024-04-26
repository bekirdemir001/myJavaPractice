package javaPractice.maths;

import java.util.Scanner;

public class ArmstrongNumbers {

    /*
    Armstrong Number Check: Write a Java program to check if a given number is an Armstrong number or not.
    Armstrong numbers are the sum of their own digits to the power of the number of digits. For Example;
        153 = 1³ + 5³ + 3³
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        boolean isArmstrong = checkArmstrong(number);

        if (isArmstrong){
            System.out.println(number + " is an Armstrong number");
        }else {
            System.out.println(number + " is not Armstrong number");
        }

        scanner.close();

    }

    //Find the number of digits
    public static int getNumberOfDigits(int number){

        int digitsCounter = 0;

        for (int i = number; i>0; i = i/10){
            digitsCounter++;
        }

        return digitsCounter;
    }

    //Create an integer array and add digits into it
    public static int[] getIntArray(int number){

        int digitsNumber = getNumberOfDigits(number);

        int[] intArray = new int[digitsNumber];

        for (int i = digitsNumber-1; i >= 0; i--){
            intArray[i] = number % 10;
            number /= 10;
        }

        return intArray;
    }

    //Create a method checks if a number is an Armstrong number or not.
    public static boolean checkArmstrong(int number){

        boolean isArmstrong = false;

        //Create an array and add numbers into it
        int[] intArray = getIntArray(number);

        //Find the narcissistic number
        int sum = 0;
        for (int w : intArray){
            sum += (int) Math.pow(w, intArray.length);
        }

        //Compare the number and the narcissistic number
        if (number == sum){
            isArmstrong = true;
        }

        return isArmstrong;
    }
}