package javaPractice.maths;

import java.util.Scanner;

public class Hypotenuse {
    /*
    Hypotenuse: Type a code that calculates the hypotenuse.
    Formula of hypotenuse: a²+b²=c²
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first perpendicular side of triangle");
        double sideFirst = scanner.nextDouble();

        System.out.println("Enter the second perpendicular side of triangle");
        double sideSecond = scanner.nextDouble();

        getHypotenuse(sideFirst, sideSecond);

        scanner.close();
    }

    //Create a method calculate the hypotenuse
    public static void getHypotenuse (double sideFirst, double sideSecond){

        double hypotenuse = Math.sqrt(Math.pow(sideFirst, 2) + Math.pow(sideSecond,2));

        System.out.println("Hypotenuse = " + hypotenuse);
    }
}