package javaPractice.practice01;

import java.util.Random;

public class OddEvenNumbers {

    /*
    Type a program that gives the number of odd and even number according to the followings;
    1. Create random 100 number (use Random Class)
    2. Create a method finds odd numbers
    3. Create a method finds even numbers
     */

    public static void main(String[] args) {

        int [] randomNumbers = getRandomNumbers();

        int numberOfOdds = getOddNumbers(randomNumbers);

        int numberOfEvens = getEvenNumbers(randomNumbers);

        System.out.println("The number of Odds = " + numberOfOdds);

        System.out.println("The number of Evens = " + numberOfEvens);

        }

    //Create random 100 number (use Random Class)
    public static int[] getRandomNumbers(){

        int[] numberArray = new int[100];
        Random random = new Random();

        for (int i=0; i<100; i++){
            numberArray[i] = random.nextInt(1000);
        }

        return numberArray;
    }

    //Create a method finds odd numbers
    public static int getOddNumbers(int[] randomNumbers){

        int oddCounter = 0;

        for (int w: randomNumbers){

            if(w % 2 != 0){
                oddCounter++;
            }

        }
        return oddCounter;
    }

    //Create a method finds even numbers
    public static int getEvenNumbers(int[] randomNumbers){

        int evenCounter = 0;

        for (int w : randomNumbers){

            if (w % 2 == 0){
                evenCounter++;
            }

        }
        return evenCounter;
    }

}