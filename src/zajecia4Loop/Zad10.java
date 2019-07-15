package zajecia4Loop;

import java.util.Scanner;

/** Napisz program który wygeneruje za pomocą (wielkość wieżyczki podajeużytkownik)
 *  a )wieżyczkę
 *  *
 *  **
 *  ***
 *  ****
 *  b )choinkę
 *     *
 *    ***
 *   *****
 *  ******* */

public class Zad10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc poziomow");
        int numberOfSteps = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj ilosc gwiazdek w podstawie");
        int numberOfStars = scanner.nextInt();
        char star = '*';
        String displayLine = "";



        for (int i=1; i<=numberOfSteps; i++) {

            //System.out.println(star);

            for (int j=0; j>=numberOfStars; j++) {
                displayLine = new StringBuilder(displayLine).append(star).toString();
                System.out.print(displayLine);
            }
        }

    }

}
