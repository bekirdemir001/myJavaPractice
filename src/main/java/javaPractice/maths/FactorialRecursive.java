package javaPractice.maths;

import java.util.Scanner;

public class FactorialRecursive {

    /*
    Factorial Calculation: Write a Java program to calculate the factorial of a given number using recursion.

    Tip: Recursion in Java refers to the process in which a method calls itself in order to solve a problem.
    In a recursive approach, a method solves a problem by breaking it down into smaller instances of the same problem
    until a base case is reached, at which point the method returns a result without further recursion.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int number = scanner.nextInt();

        int factorial = getFactorial(number);

        if (number < 0){
            System.out.println("Please enter a positive number!");
        }else {
            System.out.println("Factorial of " + number + " is = " + factorial);
        }

        scanner.close();
    }

    //Factorial Method
    public static int getFactorial(int n){

        if (n<0){
            return 0;
        }else if (n==0 || n==1){
            return 1;
        } else {
            return n*getFactorial(n-1);
        }

    }

}