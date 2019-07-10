package zajecia4Loop;

import java.util.Scanner;

/** Napisz program, który odczytuje n i oblicza n!. */

public class Zad9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int numberFinal = 1;

        if (number<=0) {
            System.out.println("Liczba musi byc wieksza od 0!");
        } else {
            for (int i=1; i<=number; i++) {
                numberFinal = numberFinal*i;
                //System.out.println(numberFinal);
            }
        }


        System.out.println("Silnia liczby: " + number + " wynosi: " + numberFinal);

    }

}
