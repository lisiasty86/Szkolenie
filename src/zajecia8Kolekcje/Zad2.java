package zajecia8Kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Napisz metodę, która dla danej listy zwraca nową posortowaną listę.
 * List<Integer> getSortedList(List<Integer> numbers);
 * */

public class Zad2 {

    public static void main(String[] args) {

        List<Integer> listToBeSorted = new ArrayList<>();
        listToBeSorted.addAll(Arrays.asList(1,8,4,9,23,456,3,5654,0));
        System.out.println(getSortedList(listToBeSorted));
    }

    public static List<Integer> getSortedList(List<Integer> numbers){
        //Collections.sort(numbers);


        int helper;
        for (int i=0; i<numbers.size(); i++) {
            for (int j=0; j<numbers.size(); j++) {
                if (numbers.get(i) < numbers.get(j)) {
                    helper = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, helper);
                }
            }
        }
        return numbers;
    }
}
