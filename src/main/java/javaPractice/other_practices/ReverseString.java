package javaPractice.other_practices;

import java.util.Scanner;

public class ReverseString {

    /*
    Reverse a String: Write a Java program to reverse a given string without using built-in functions.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();

        String reversedStr = getReversedString(str);

        System.out.println("Reversed String is = " + reversedStr);

        scanner.close();
    }

    //Reverse String Method
    public static String getReversedString(String str){

        String[] strArray = str.split("");
        String[] strReversedArray = new String[strArray.length];

        //Get reversed array
        for (int i=0; i<str.length(); i++){
            strReversedArray[i] = strArray[(strArray.length-1)-i];
        }

        //Transform reversed array to string
        StringBuilder stb = new StringBuilder();
        for (String w : strReversedArray){
            stb.append(w);
        }

        return stb.toString();
    }
}