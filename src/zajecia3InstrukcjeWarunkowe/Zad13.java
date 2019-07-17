package zajecia3InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        if (liczba%3==0 || liczba%5==0) {
            System.out.println("Liczba podzielna przez 3 lub 5");
        } else {
            System.out.println("Liczba niepodzielna przez 3 ani 5");
        }


    }

}
