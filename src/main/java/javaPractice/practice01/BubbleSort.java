package javaPractice.practice01;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    /*
    Write a Java program to implement the bubble sort algorithm for sorting an array of integers.

    Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
    if they are in the wrong order.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements of an array");
        int n = scanner.nextInt();

        int[] intArray = new int[n];

        for (int i=0; i<n; i++){
            System.out.println("Enter " + (i+1) + ". element");
            intArray[i] = scanner.nextInt();
        }

        getBubbleSort(intArray);

    }

    //Bubble Sort Method
    public static void getBubbleSort(int[] intArray){

        int temp;
        boolean swapped;

        for (int i=0; i<intArray.length-1; i++){
            swapped = false;
            for (int j=0; j<intArray.length-1-i; j++){
                if (intArray[j]>intArray[j+1]){
                    // Swap intArray[j] and intArray[j+1]
                    temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;

                    swapped = true;
                }
            }
            //If there is no swap in inner loop, then loop breaks
            if (!swapped){
                break;
            }
        }
        System.out.println("Bubble Sort Array = " + Arrays.toString(intArray));
    }
}
