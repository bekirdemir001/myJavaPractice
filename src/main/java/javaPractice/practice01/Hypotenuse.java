package javaPractice.practice01;

public class Hypotenuse {
    /*
    Type a code that calculates the hypotenuse.
    Formula of hypotenuse: a²+b²=c²
     */
    public static void main(String[] args) {

        double a = 12, b = 16, c;

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));

        System.out.println("Hypotenuse = " + c);//20.0

    }
}