package javaPractice.maths;

import java.util.Scanner;

public class PrimeNumber {

    /*
        Prime Number Check: Write a Java program to check if a given number is prime or not.
        A prime number (or a prime) is a natural number greater than 1 that is not a product of two smaller natural numbers.
        For Example: 5 is a prime. Because 5=1*5 or 5=5*1
                But: 4 is not a prime. Because 4=1*4, 4=4*1 and 4=2*2
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

       boolean isPrime = checkPrime(number);

       if (number<2){
           System.out.println("Please enter a naturel number greater than 1");
       }else if (isPrime){
           System.out.println(number + " is a prime number");
       }else {
           System.out.println(number + " is not a prime number");
       }

       scanner.close();
    }

    public static boolean checkPrime(int n){

        boolean isPrime = true;

        for (int i=2; i<n; i++){

            if (n % i == 0){
                isPrime = false;
                break;
            }

        }
        return isPrime;
    }

}