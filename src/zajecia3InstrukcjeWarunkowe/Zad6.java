package zajecia3InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int pierwszaLiczba = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int drugaLiczba = scanner.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int trzeciaLiczba = scanner.nextInt();

        if (pierwszaLiczba<drugaLiczba) {
            if (pierwszaLiczba<trzeciaLiczba) {
                System.out.println("Najmniejsza liczba to: " + pierwszaLiczba);
            } else {
                System.out.println("Najmniejsza liczba to: " + trzeciaLiczba);
            }
        } else if (drugaLiczba<trzeciaLiczba) {
            System.out.println("Najmniejsza liczba to: " + drugaLiczba);
        } else {
            System.out.println("Najmniejsza liczba to: " + trzeciaLiczba);
        }



    }

}
