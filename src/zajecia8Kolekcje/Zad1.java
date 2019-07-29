package zajecia8Kolekcje;

import java.util.*;

/**
 *Napisz metodę, która dla danej listy zwraca nową listę elementów, które są podzielne przez 3.
 *List​<Integer> getDividedByThree(​List​<Integer> numbers);
 * */

public class Zad1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(5,6,9,1643,21,8,999,6754,3));
        System.out.println(areDevided(list));
    }

    public static List<Integer> areDevided(List<Integer> list) {
        List<Integer> devidedList = new ArrayList<>();
        for (int i=0; i<list.size(); i++){
            if (list.get(i)%3==0){
                devidedList.add(list.get(i));
            }
        }
        return devidedList;
    }

}
