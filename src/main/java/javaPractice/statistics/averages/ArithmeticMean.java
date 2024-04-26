package javaPractice.statistics.averages;

import java.util.Arrays;
import java.util.Random;

public class ArithmeticMean {

    /*
        Arithmetic Mean: Type a program that calculate the arithmetic mean of 100 numbers come from Random Class.
     */
    public static void main(String[] args) {

        double average = getArithmeticMean(getNumbers());
        System.out.println("The Arithmetic Mean of Numbers = " + average);

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

    //Create a method finds arithmetic mean
    public static double getArithmeticMean(int[] numberArray){

        double sum = Arrays.stream(numberArray).sum();
        return sum / 100;
    }
}