package javaPractice.maths;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfCircle {

    /*
    Calculate Area of a Circle; Write a Java program to calculate the area of a circle given its radius.
    Hint: Area = π r²
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a radius of the circle");
        double radius = scanner.nextDouble();;

        getAreaOfCircle(radius);
    }

    //Create a method calculate area of a circle
    public static void getAreaOfCircle(double radius){

        //Calculate the area
        double area = Math.PI * Math.pow(radius, 2);

        //Just take two decimals
        DecimalFormat df = new DecimalFormat(".##");

        System.out.println("The area of the circle is = " + df.format(area));
    }

}