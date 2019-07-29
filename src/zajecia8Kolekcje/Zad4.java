package zajecia8Kolekcje;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Napisz program, który symuluje działanie słownika polsko-angielskiego.
 * Przykładowy program:
 * Podaj słówko po Polsku: mama
 * Słówko po Angielsku to mother.
 * */

public class Zad4 {

    public static void main(String[] args) {

        translateToEnglish();

    }

    public static HashMap<String, String> translateToEnglish () {
        HashMap<String, String> mapOfWords = new HashMap<>();
        mapOfWords.put("mama", "mother");
        mapOfWords.put("tata", "father");
        mapOfWords.put("samochód", "car");
        mapOfWords.put("siostra", "sister");
        mapOfWords.put("brat", "brother");
        mapOfWords.put("pies", "dog");

        Scanner scanner = new Scanner(System.in);
        String helper = "";

        System.out.println("Podaj slowko po Polsku");
        helper = scanner.nextLine().toLowerCase();
        //String key = helper.toLowerCase();
        System.out.println(helper);

        if (mapOfWords.containsKey(helper)) {
            System.out.println("Słówko po Angielsku to: " + mapOfWords.get(helper));
        }
        return mapOfWords;
    }

}
