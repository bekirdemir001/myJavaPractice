package javaPractice.statistics.averages;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuadraticMean {

    /*
    Quadratic Mean or most common name Root Mean Square (RMS):
    In mathematics, the root-mean-square (rms) of a set of numbers is the square root of the set's mean square. The RMS is
    also known as the quadratic mean.
     */

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter an integer number" + "\nPress Q to exit");
            String str = scanner.next();

            if (str.equalsIgnoreCase("Q")){
                System.out.println("******************* Result ********************");
                break;
            }else {
                numberList.add(Integer.valueOf(str));
            }
        }while (true);

        double RMS = getRMS(numberList);

        //Show only 2 decimals
        DecimalFormat df = new DecimalFormat(".##");

        System.out.println("Root Mean Square = " + df.format(RMS));
    }

    //Create a method calculate RMS
    public static double getRMS(List<Integer> numberList){

        double RMS;
        double sumOfMeanSquare = 0.0;

        //Find first the sum of mean square
        for (Integer w : numberList){
            sumOfMeanSquare += Math.pow(w, 2);
        }

        //Find second RMS
        RMS = Math.sqrt(sumOfMeanSquare/numberList.size());

        return RMS;
    }

}