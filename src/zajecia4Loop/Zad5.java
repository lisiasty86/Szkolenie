package zajecia4Loop;

import java.util.Scanner;

/** Napisz program, który odczytuje n i sumuje liczby od 1 do n. */

public class Zad5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int finalCount = 0;

        for (int i=1; i<=number; i++) {
            finalCount = finalCount+i;
            //System.out.println(finalCount);
        }
        System.out.println("Final sum = " + finalCount);
    }

}
