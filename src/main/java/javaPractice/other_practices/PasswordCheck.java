package javaPractice.other_practices;

import java.util.Scanner;

public class PasswordCheck {

    /*
    Password Check: Check the following rules;
    1. Password must contain no spaces.
    2. Password must contain at least 8 characters
    3. Password must contain at least one lowercase letter
    4. Password must contain at least one uppercase letter
    5. Password must contain at least one number
    6. Password must contain at least one symbol

    If the password meets the requirements, print "Password created successfully!" on the console.
    If the password doesn't meet the requirements, give an error message and new chance.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a password");
            String password = scanner.nextLine();

            boolean isValid = checkPassword(password);

            if (isValid){
                System.out.println("Password created successfully!");
                break;
            }

        }while (true);

        scanner.close();
    }

    public static boolean checkPassword(String password){

        boolean isValid = true;

        //1. Password must contain no spaces.
        if (password.contains(" ")){
            System.out.println("Password must contain no spaces!");
            isValid = false;
        }

        //2. Password must contain at least 8 characters
        if (password.length() < 8){
            System.out.println("Password must contain at least 8 characters!");
            isValid = false;
        }

        //3. Password must contain at least one lowercase letter
        if (password.replaceAll("[^a-z]", "").isEmpty()){
            System.out.println("Password must contain at least one lowercase letter!");
            isValid = false;
        }

        //4. Password must contain at least one uppercase letter
        if (password.replaceAll("[^A-Z]", "").isEmpty()){
            System.out.println("Password must contain at least one uppercase letter!");
            isValid = false;
        }

        //5. Password must contain at least one number
        if (password.replaceAll("[^0-9]", "").isEmpty()){
            System.out.println("Password must contain at least one number!");
            isValid = false;
        }

        //6. Password must contain at least one symbol
        if (password.replaceAll("[a-zA-Z0-9]", "").isEmpty()){
            System.out.println("Password must contain at least one symbol!");
            isValid = false;
        }

        return isValid;
    }

}