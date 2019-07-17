package zajecia3InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if (word.contains("kajak")) {
            System.out.println("Slowo zawiera kajak");
        } else {
            System.out.println("Slowo nie zawiera kajak");
        }

    }

}
