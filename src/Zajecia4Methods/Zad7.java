package Zajecia4Methods;

import java.util.Scanner;

/** Napisz funkcję, która wyznacza sumę cyfr liczby całkowitej. */

public class Zad7 {

    public static void main(String[] args) {

        suma();

    }



    public static void suma() {
        int number, result;

        Scanner scanner= new Scanner(System.in);
        number = scanner.nextInt();

        result = 0;

        while (number != 0) {
            result += number % 10; //oddzielam od liczby dziesiatki
            System.out.println((result));
            number /= 10; //oddzielam jednostki
            System.out.println(number);
        }

        System.out.println("Wynik: " + result);
    }

}
