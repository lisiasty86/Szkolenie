package zajecia8Kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad8 {

    public static void main(String[] args) {
        List<Integer> listToBeReversed = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        System.out.println(reverse(listToBeReversed));
    }

    public static List<Integer> reverse(List<Integer> list) {
        List<Integer> reverseList = new ArrayList<>();
        for (int i : list) {
            reverseList.add(list.get(list.size()-(i+1)));
        }
        return reverseList;
    }
}
