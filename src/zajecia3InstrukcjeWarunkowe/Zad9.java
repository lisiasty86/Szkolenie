package zajecia3InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pierwszy wyraz");
        String word1 = scanner.next();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Drugi wyraz");
        String word2 = scanner2.next();

        if (word1.equals(word2)) {
            System.out.println("Wyrazy sa takie same");
        } else {
            System.out.println("Wyrazy sa rozne");
        }

    }

}
