package javaPractice.practice01;

import java.util.Scanner;

public class PasswordCheck {

    /*
    1. Create a String variable, for example; String password = "12345";
    2. Get a password from the user.
    3. Compare two values come from the String variable and the user.
    4. If two value are equal to each other, print "Login Successful" on the console.
    5. If two value are not equal to each other, print "Login Unsuccessful!" on the console.

    Sample input 1: "51344" --> Sample output 1: "Login Unsuccessful!"
    Sample input 2: "12345" --> Sample output 2: "Login Successful!"
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password");
        String password = scanner.nextLine();

        checkPassword(password);
    }

    public static void checkPassword(String pass){

        String password = "12345";

        if(pass.equals(password)){
            System.out.println("Login Successful");
        }else {
            System.out.println("Login Unsuccessful!");
        }
    }

}