package zajecia3InstrukcjeWarunkowe;

import java.util.Scanner;;

public class Zad12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String kod = scanner.next();

        if (kod.matches("[0-9]{2}-[0-9]{3}")) {
            System.out.println("Kod poprawny");
        } else {
            System.out.println("Kod niepoprawny");
        }

    }

}
