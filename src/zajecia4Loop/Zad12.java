package zajecia4Loop;

import java.util.ArrayList;
import java.util.Scanner;

/** Napisz program, który odczytuje wyraz i sprawdza czy wyraz jest palindromem. */

public class Zad12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String wordEnteredByUser = scanner.nextLine();
        int wordLength = wordEnteredByUser.length();
        String wordAfterChange = "";
        String helperString = "";
        System.out.println(wordLength);

        ArrayList<String> charactersTable = new ArrayList<String>();


        char character = ' ';

        for (int i=wordLength-1, j=0; i>=0 && j<=wordLength; i--, j++) {

            wordAfterChange = wordEnteredByUser.substring(i);
            character = wordAfterChange.charAt(0);

            charactersTable.add(Character.toString(character));

            helperString = new StringBuilder(helperString).append(character).toString();

        }

        if (wordEnteredByUser.equals(helperString)) {
            System.out.println("Wyraz jest palindromem: " + "oryginal: " + wordEnteredByUser + "; wyraz odwrocony: " + helperString);
        } else {
            System.out.println("Wyraz nie jest palindromem: " + "oryginal: " + wordEnteredByUser + "; wyraz odwrocony: " + helperString);
        }
    }

}
