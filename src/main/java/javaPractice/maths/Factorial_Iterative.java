package javaPractice.maths;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial_Iterative {

    /*
        Factorial Calculation (Iterative):
        Write a Java program to calculate the factorial of a given number using iteration (without recursion).
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        long factorial = 0;

        do {
            System.out.println("Enter a positive integer");

            //Check if a number is an integer and positive, or not
            try {
                number = scanner.nextInt();
                if (number < 0){
                    System.out.println("Enter a positive number!" + "\n**************************************");
                }else {
                    factorial = getFactorial(number);
                    System.out.println("Factorial = " + factorial);
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("Please just enter an integer!");
                break;
            }

        }while (true);

    }

    //Create a method calculate factorial
    public static long getFactorial(int number){

        long factorial = 1;
        for (int i=2; i<=number; i++){
            factorial *= i;
        }

        return factorial;
    }

}