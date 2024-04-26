package javaPractice.maths;

import java.util.Scanner;

public class BinaryToDecimalConversion {

    /*
    Binary to Decimal Conversion: Write a Java program to convert a binary number to its decimal equivalent.
    For Example; (111001) --> 57
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int binaryNumber = scanner.nextInt();

        getBinaryToDecimal(binaryNumber);

        scanner.close();
    }

    //Find the number of binary digits
    public static int getTheNumberOfBinaryDigits(int binaryNumber){
        int binaryDigits = 0;
        for (int i = binaryNumber; i > 0; i = i/10){
            binaryDigits++;
        }
        return binaryDigits;
    }

    //Create an integer array and add binary number into it
    public static int[] getBinaryNumberArray(int binaryNumber){

        int binaryDigits = getTheNumberOfBinaryDigits(binaryNumber);

        int[] binaryArray = new int[binaryDigits];

        for (int i = binaryDigits; i > 0; i--){
            binaryArray[i-1] = binaryNumber % 10;
            binaryNumber /= 10;
        }
        return binaryArray;
    }

    //Binary to Decimal Conversion Method
    public static void getBinaryToDecimal(int binaryNumber){

        //Find the decimal number
        int binaryDigits = getTheNumberOfBinaryDigits(binaryNumber);
        int[] binaryArray = getBinaryNumberArray(binaryNumber);

        double decimalNumber = 0.0;
        for (int j = 0; j < binaryDigits; j++){
            decimalNumber += binaryArray[binaryDigits-1-j] * Math.pow(2, j);
        }

        System.out.println("The decimal conversion of the binary number = " + decimalNumber);
    }

}