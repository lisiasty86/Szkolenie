package zajecia3InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();
        boolean a = imie.endsWith("a");

        //System.out.println(a);
        if (imie.endsWith("a") == true) {
            System.out.println("Zenskie");
        } else {
            System.out.println("Meskie");
        }

    }

}
