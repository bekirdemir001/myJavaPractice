package javaPractice.statistics.averages;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HarmonicMean {

    /*
    Harmonic Mean; Write a program that calculate harmonic mean.
    The harmonic mean can be expressed as the reciprocal of the arithmetic mean of the reciprocals of the given set of
    observations.
    For Example: 1, 4, 4 --> harmonic mean = 2
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();

        do {
            System.out.println("""
                    **************Welcome to find Harmonic Mean******************
                    Enter a number
                    Press 0 to exit""");

            int number = scanner.nextInt();

            if (number == 0){
                System.out.println("*******************Good Bye*******************");
                break;
            }else {
                numberList.add(number);
            }

        }while (true);

        getHarmonicMean(numberList);

        scanner.close();
    }

    //Create a method calculate harmonic mean
    public static void getHarmonicMean(List<Integer> numberList){

        double harmonicMean;
        double denominator = 0.0;

        //Find the denominator in harmonic mean formula
        for (Integer w : numberList){
            denominator += (double) 1 / w;
        }

        harmonicMean = numberList.size() / denominator;

        System.out.println("Harmonic Mean is = " + harmonicMean);
    }
}