package zajecia8Kolekcje;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Zad6 {

    public static void main(String[] args) {

        System.out.println(listOfColours());

    }

    public static List<String> listOfColours() {
        List<String> listOfColours = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean validData = true;
        String helper = "";

    while (validData) {
        System.out.println("Dodaj kolor do tablicy");

        try {
            helper = scanner.nextLine();
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        if (helper == null || helper.trim().isEmpty()) {

            validData = false;
        } else {
            listOfColours.add(helper);
            System.out.println("Dodano kolor " + "\"" + helper + "\"" + ", jesli chcesz zakonczyc, wcisnij ppo prsostu enter bez podawania koloru");
        }
    }

        return listOfColours;
    }

}
