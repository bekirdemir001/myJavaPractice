package javaPractice.statistics.averages;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeometricMean {

    /*
    Geometric Mean: Write a program that calculate geometric mean.
    Generally geometric mean of n numbers is the nth root of their product.
    Geometric mean = (x1 * x2 * x3 * . . . * xn)1/n
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        do {
            System.out.println("""
                    ***************Welcome to find Geometric Mean****************
                    Enter a number!
                    Press 0 to exit""");

            int number = scanner.nextInt();

            if (number == 0){
                System.out.println("*************Good Bye********************");
                break;
            }else {
                numberList.add(number);
            }
        }while (true);

        getGeometricMean(numberList);

        scanner.close();
    }

    //Write a method calculate geometric mean
    public static void getGeometricMean(List<Integer> numberList){

        //Find product of numbers
        int product = 1;
        for (Integer w : numberList){
            product *= w;
        }

        //Get nth square of product
        double geometricMean = Math.pow(product, (double) 1 /numberList.size());

        System.out.println("The geometric mean of the number is = " + geometricMean);
    }

}