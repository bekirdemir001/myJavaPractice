package javaPractice.maths;

import java.util.Scanner;

public class Calculator {

    /*
    Calculator: Type a program that calculate mathematical operations.
    1. Basic operations : addition, subtraction, multiplication and division.
    2. Show a menu to the user, for example; 1-Addition, 2-Subtraction, ...
    3. Get two number from the user
    4. Make the selected operation and print on the console
     */

    static Scanner scanner = new Scanner(System.in);
    static int selection;

    public static void main(String[] args) {

        selection = showMenu();

        System.out.println("Enter first number");
        int first = scanner.nextInt();

        System.out.println("Enter second number");
        int second = scanner.nextInt();

        calculator(selection, first, second);

        scanner.close();
    }

    //Menu
    public static int showMenu() {
        do {
            //Concatenation with text block
            System.out.println("""
                    *************** Welcome *******************
                    Select the mathematical operation
                    1-Addition
                    2-Subtraction
                    3-Multiplication
                    4-Division
                    *******************************************""");

            selection = scanner.nextInt();

            if (selection < 1 || selection > 4) {
                System.out.println("Please enter a number between 1 and 4!");
            }else {break;}

        } while (true);

        return selection;
    }

    //Calculator
    public static void calculator(int selection, int first, int second){

        switch (selection){
            case 1:
                int additionResult= addition(first, second);
                System.out.println("Addition Result = " + additionResult);
                System.out.println("************ Good Bye! ******************");
                break;
            case 2:
                int subtractionResult = subtraction(first, second);
                System.out.println("Subtraction Result = " + subtractionResult);
                System.out.println("************ Good Bye! ******************");
                break;
            case 3:
                int multiplicationResult = multiplication(first, second);
                System.out.println("Multiplication Result = " + multiplicationResult);
                System.out.println("************ Good Bye! ******************");
                break;
            case 4:
                double divisionResult = division(first, second);
                System.out.println("Division Result = " + divisionResult);
                System.out.println("************ Good Bye! ******************");
                break;
            default:
                System.out.println("Enter a valid number");
                break;
        }
    }

    //Mathematical Operations
    public static int addition(int a, int b){
        return a+b;
    }

    public static int subtraction(int a, int b){
        return a-b;
    }

    public static int multiplication(int a, int b){
        return a*b;
    }

    public static double division(int a, int b){
        return (double) a/b;
    }

}