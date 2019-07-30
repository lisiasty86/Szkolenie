package zajecia8Kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class zad12 {

    public static void main(String[] args) {
        LinkedList<Integer> givenList = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(listConverter(givenList));
    }

    public static ArrayList<Integer> listConverter(LinkedList<Integer> list) {
        ArrayList<Integer> convertedList = new ArrayList<>();
        int temp;
        for (int i=0;i<list.size();i++){
            temp = list.get(i);
            convertedList.add(temp);
        }
        return convertedList;
    }

}
