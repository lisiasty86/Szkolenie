package zajecia8Kolekcje;

import java.util.*;

/**
 * Napisz program, który odczytuje n liczb i wypisuje liczbę wystąpień danej liczby.
 * Przykładowo dla danych:
 * 6
 * 1 2 4 4 4 3 3
 * Wypisuje na ekran:
 * 1 występuje 1 raz
 * 2 występuje 1 raz
 * 3 występuje 2 razy
 * 4 występuje 3 razy
 * */

public class Zad3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,4,5,7,8,9,5,4,4,4,4,6,6,6,6,8,8,9,9,3,3,0));

        finalList(list);
    }

    public static HashMap<Integer, Integer> finalList(List<Integer> numbers) {
        HashMap<Integer, Integer> finalMap = new HashMap<>();
        int counter = 0;

        for (int i=0; i<numbers.size(); i++) {
            for (int j=0; j<numbers.size();j++) {
                if (numbers.get(i) == numbers.get(j)) {
                    counter++;
                }
            } finalMap.put(numbers.get(i), counter);
            counter = 0;
        }

        for (Map.Entry<Integer, Integer> number : finalMap.entrySet()) {
            Integer key = number.getKey();
            Integer value = number.getValue();
            if (value != 1) {
                System.out.println(key + " wystepuje " + value + " razy");
            } else {
                System.out.println(key + " wystepuje " + value + " raz");
            }
        }
        return finalMap;
    }

}
