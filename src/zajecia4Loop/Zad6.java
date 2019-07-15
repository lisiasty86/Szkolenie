package zajecia4Loop;

import java.util.Scanner;

/** Napisz prostą grę - zadaniem użytkownika będzie zgadnięcie liczby,
 * którązainicjujemy w programie (przykładowa liczba 600). W przypadku,
 * gdy liczbabędzie za duża lub za mała, użytkownik otrzyma odpowiednią podpowiedź.
 * Gramy tak długo dopóki użytkownik zgadnie liczbę. */

public class Zad6 {

    public static void main(String[] args) {
        int numberToGuess = 30;

        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Podaj liczbe");
            number = scanner.nextInt();

            if (number != numberToGuess) {
                System.out.println("Bledna liczba");
            } else {
                System.out.println("Brawo, liczba to: " + numberToGuess);
            }
        } while (number != numberToGuess);

    }

}
