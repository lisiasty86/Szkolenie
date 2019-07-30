package zajecia8Kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zad9 {

    public static void main(String[] args) {
        List<Integer> listToFIndMax = new ArrayList<>(Arrays.asList(1,2,3,4,8,6,44,255,0,7,32));
        System.out.println(getMax(listToFIndMax));
    }

    public static int getMax(List<Integer> list) {
        //Collections.sort(list);

        int helper;
        for (int i=0; i<list.size(); i++) {
            for (int j=0; j<list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    helper = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, helper);
                }
            }
        }
        
        int maxElement = list.get(list.size()-1);
        return maxElement;
    }
}
