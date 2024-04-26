package javaPractice.maths;

import java.util.Scanner;

public class FibonacciSequence {

    /*
    Fibonacci Sequence: Write a Java program to generate the Fibonacci series up to a given number of terms.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to get fibonacci numbers");
        int number;

        do {
            number = scanner.nextInt();

            if (number<0) {
                System.out.println("Please enter a positive number!");
            } else {
                for (int i = 0; i < number+1; i++){
                    int fibNum = getFibonacciNumber(i);
                    System.out.print(fibNum + " ");
                }
                break;
            }
        }while (true);

        scanner.close();
    }

    //Fibonacci Sequence
    public static int getFibonacciNumber(int n){

        if (n<0){
            return -1;
        }else if (n==0){
            return 0;
        }else if (n==1) {
            return 1;
        }else {
            return getFibonacciNumber(n-1) + getFibonacciNumber(n-2);
        }

    }

}