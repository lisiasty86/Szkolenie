package zajecia4Loop;

import java.util.ArrayList;
import java.util.Scanner;

/** Odczytaj wyraz i wypisz wszystkie cyfry występujące w wyrazie. */

public class Zad11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String wordGivenByUser = scanner.nextLine();
        int numberOfCharacters = wordGivenByUser.length();
        ArrayList<String> characters = new ArrayList<String>();

        for (int i=0; i<=numberOfCharacters-1; i++) {
            String characterHelper = wordGivenByUser.substring(i);
            char character = characterHelper.charAt(0);

            if (Character.isDigit(character)) {
                System.out.println(character);
            }
        }
    }
}
