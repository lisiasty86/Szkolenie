package zajecia8Kolekcje;

import java.util.Arrays;
import java.util.LinkedList;

public class Zad11 {

    public static void main(String[] args) {

        LinkedList<Integer> givenList = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(elementSwitcher(givenList));
    }

    public static LinkedList<Integer> elementSwitcher(LinkedList<Integer> list) {
        LinkedList<Integer> finalList = new LinkedList<>();
        finalList.addAll(list);
        int temp = finalList.get(0);
        finalList.set(0, finalList.get(2));
        finalList.set(2, temp);
        return finalList;
    }

}
