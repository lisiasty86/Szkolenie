package zajecia8Kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Napisz metodę, która zwraca liczbę różnych słów występujących w liście.
 * int getNumberDifferentWords(List<String> words);
 * */

public class Zad13 {

    public static void main(String[] args) {

        List<String> listWithWords = new ArrayList<>(Arrays.asList("test", "test", "test", "mama", "tata", "mana", "test", "nic"));

        System.out.println(getNumberDifferentWords(listWithWords));

    }

    public static int getNumberDifferentWords(List<String> list){
        int numberOfDifferentWords=-1;
        String word;
        String wordHelper;
        int counter = 0;

        for (int i=0; i<list.size(); i++){
            word = list.get(i);
            for (int j=i+1; j<list.size(); j++){
                wordHelper = list.get(j);
                if (word.equals(wordHelper)) {
                    counter=counter+1;
                }
            }
            System.out.println();
        }

        return numberOfDifferentWords;
    }

}
