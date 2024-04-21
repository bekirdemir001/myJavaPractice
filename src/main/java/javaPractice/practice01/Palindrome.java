package javaPractice.practice01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Palindrome {

    /*
    Type a code finds palindromic words.
    Palindromes are sentences, words and numbers that read the same backwards.
    For example:
        input = mustang                 input = civic
        output = Non-Palindromic       output = Palindromic
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String!");
        String input = scanner.nextLine();

        //1.Way: With StringBuilder
        StringBuilder stb = new StringBuilder(input);

        String reversedInput = stb.reverse().toString();

        if (input.equals(reversedInput)){
            System.out.println("Palindromic word with StringBuilder");
        }else {
            System.out.println("Non-Palindromic word with StringBuilder");
        }

        //2.Way: With Array
        String[] inputArray = input.split("");
        String[] reversedInputArray = new String[inputArray.length];

        for (int i=inputArray.length-1; i>=0; i--){
            reversedInputArray[i] = inputArray[inputArray.length-1-i];
        }

        if (Arrays.equals(inputArray, reversedInputArray)){
            System.out.println("Palindromic word with Array");
        }else {
            System.out.println("Non-Palindromic word with Array");
        }

        //3.Way: With For-Loop
        boolean isPalindrome = true;

        for (int i=0; i<input.length(); i++){
            if (input.charAt(i) != input.charAt(input.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome){
            System.out.println("Palindromic word with For-Loop");
        }else {
            System.out.println("Non-Palindromic word with For-Loop");
        }

    }
}