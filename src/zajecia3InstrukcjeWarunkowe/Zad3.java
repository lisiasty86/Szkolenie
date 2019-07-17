package zajecia3InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        //boolean x = word.equals("Akademia");

        if (word.equals("Akademia")) {

            System.out.println("Poprawne haslo");

        } else {
            System.out.println("Niepoprawne haslo");
        }

    }

}
