package Zajecia4Methods;

import java.util.Scanner;

/** Napisz funkcję substract wyznaczającą różnicę dwóch zadanych liczbcałkowitych.
 * Działanie funkcji sprawdź pisząc odpowiedni program. */

public class Zad2 {

    public static void main(String[] args) {

        returnNumber1FromScanner();
        returnNumber2FromScanner();

        substact();

        testPassed();
    }

    public static int substact() {

        int result;

        result = returnNumber1FromScanner() - returnNumber2FromScanner();

        System.out.println("Roznica to: " + (result));
        return result;
    }

    public static int returnNumber1FromScanner() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int num1 = scanner.nextInt();

        return num1;

    }

    public static int returnNumber2FromScanner() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj druga liczbe");
        int num2 = scanner.nextInt();

        return num2;

    }

    public static boolean testPassed() {
        int testNum1 = returnNumber1FromScanner() - returnNumber2FromScanner();
        boolean trueOrFalse = false;

        if (substact() == testNum1) {
            trueOrFalse = true;
        }
        return trueOrFalse;
    }

}
