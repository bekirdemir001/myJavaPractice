package javaPractice.practice01;

import java.util.Arrays;
import java.util.Random;

public class Average {

    /*
        Type a program that calculate the average of 100 numbers.
        1. These numbers must be changed every time when the program runs.
        2. Create a method that calculate the average of numbers.
        3. This method accepts only an array.
        3. This method returns double variable.

     */
    public static void main(String[] args) {
       double average = getAverage(getNumbers());
        System.out.println("The average of an Array = " + average);
    }

    //Create an array contains 100 numbers
    public static int[] getNumbers(){

        int[] numberArray = new int[100];

        Random random = new Random();
        int number;

        for (int i = 0; i<100; i++){
            number = random.nextInt(1000);
            numberArray[i] = number;
        }

        return numberArray;
    }

    //Create an average method
    public static double getAverage(int[] numberArray){

        double sum = Arrays.stream(numberArray).sum();
        return sum / 100;
    }
}