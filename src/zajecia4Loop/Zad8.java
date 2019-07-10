package zajecia4Loop;

import java.util.Scanner;

/** Napisz program, który prosi o podanie poprawnego hasła( hasło to Polska),
 * takdługo jak użytkownik nie odgadnie hasła wyświetlany jest komunikat podajpoprawne hasło. */

public class Zad8 {

    public static void main(String[] args) {

        String correctPassword = "password";

        Scanner scanner = new Scanner(System.in);
        String passwordFromUser;

        int retryCount = 1;

        do {
            System.out.println("Podaj haslo");
            passwordFromUser = scanner.nextLine();

            if (passwordFromUser.equals(correctPassword)) {
                System.out.println("Brawo, poprawne haslo");
                break;

            } else {
                System.out.println("Bledne haslo, sprobuj ponownie");

                if (retryCount >2) {
                    System.out.println("Osiagnoles limit prob. Konto zablokowane");
                    break;
                }
                retryCount++;
            }


        } while ((!passwordFromUser.equals(correctPassword)) || retryCount<=3);

    }

}
