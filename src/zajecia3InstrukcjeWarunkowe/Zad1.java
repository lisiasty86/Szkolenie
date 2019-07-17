package zajecia3InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad1 {


    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    if (a > 5) {
        System.out.println("Zmienna wieksza od 5");
    } else {
        System.out.println("Zmienna mniejsza od 5");
    }

    }
}
