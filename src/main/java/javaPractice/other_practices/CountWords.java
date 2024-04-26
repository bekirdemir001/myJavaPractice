package javaPractice.other_practices;

import java.util.Scanner;

public class CountWords {

    /*
    Count Words in a Sentence: Write a Java program to count the number of words in a given sentence.
    For Example: "I Love Coding" --> result = 3
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = scanner.nextLine();

        getNumberOfWords(str);

        scanner.close();
    }

    //Count Words Method
    public static void getNumberOfWords(String str){

        String[] strArray = str.split(" ");
        int counter = 0;

        for (String w : strArray){
            counter++;
        }

        System.out.println("The number of words = " + counter);
    }

}