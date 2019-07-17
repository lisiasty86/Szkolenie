package zajecia3InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if (word.endsWith("M") || word.endsWith("m")) {
            System.out.println("Wyraz konczy sie na M lub m");
        } else {
            System.out.println("Wyraz nie konczy sie na M ani m");
        }


    }

}
