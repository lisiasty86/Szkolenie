package Zajecia4Methods;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Zad8 {

    public static void main(String[] args) {

        System.out.println(isSquareOfIntegerNumber(100));

    }


    public static boolean isSquareOfIntegerNumber(int number) {
        double sqrtResult = Math.sqrt(number);
        //System.out.println(sqrtResult);
        boolean check = false;

        if (number % sqrtResult == 0) {
            check = true;
        }

        return check;
    }

}
