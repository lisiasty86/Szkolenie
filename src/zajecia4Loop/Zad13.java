package zajecia4Loop;

import java.util.Scanner;

/** Napisz program drukujący na ekranie 19 gwiazdek: */

public class Zad13 {

    public static void main(String[] args) {

        String word = "";
        char character = '*';
        int numberGivenByUser = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podal liczbe gwiazdek");
        numberGivenByUser = scanner.nextInt();


        for (int i=1; i<=numberGivenByUser; i++) {
            word = new StringBuilder(word).append(character).toString();
        }


        System.out.println(word);

    }

}
