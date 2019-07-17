package zajecia3InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if ((word.startsWith("http://www.") || word.startsWith("https://www.") || word.startsWith("www.")) && word.endsWith(".pl")) {
            System.out.println("Poprawny url");
        } else {
            System.out.println("Bledny url");
        }

    }

}
