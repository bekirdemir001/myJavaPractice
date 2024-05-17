package javaPractice.other_practices;

import java.util.Scanner;

public class LeapYear {

    /*
    Check Leap Year: Write a Java program to check if a given year is a leap year or not.
    To determine whether a year is a leap year, follow these steps:
        1. If the year is divided by 100, it must also be divided by 400.
            1600 --> Leap   1800 --> Not Leap
        2. If the year is not divisible by 100, it should be divided by 4.
            2004 --> Leap   2005 --> Not Leap
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a year");
            System.out.println("Enter -1 for exit");
            int year = scanner.nextInt();
            boolean isLeap = false;

            //For exit
            if(year==-1){
                System.out.println("*************** Good Bye! ********************");
                break;
            }

            //Year cannot be negative
            if (year < 0){
                System.out.println("Year should be positive!");
                System.out.println("Please try again!");
                break;
            }else {
                isLeap = isLeapYear(year);
            }

            //Give message to the user
            if (isLeap){
                System.out.println("Leap Year");
            }else {
                System.out.println("Not a Leap Year");
            }

        }while (true);

    }

    //Create a method weather a year leap year or not
    public static boolean isLeapYear(int year){

        boolean isLeapYear = false;

        //Check first rule
        if (year % 100 == 0 & year % 400 == 0){
            isLeapYear = true;
        }

        //Check second rule
        if (year % 100 != 0 & year % 4 == 0){
            isLeapYear = true;
        }

        return isLeapYear;
    }
}
