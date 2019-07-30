package zajecia8Kolekcje;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Zad10 {

    public static void main(String[] args) {

        LinkedList<Integer> listWithoutAdditionalElement = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println("Second solution final table: " + addExstraElement(listWithoutAdditionalElement));
    }

    public static LinkedList<Integer> addExstraElement (LinkedList<Integer> list) {

        /**
         *
         * First solution
         *
         * */
        long startTimeFirstSolution = System.nanoTime(); /**Start counting duration for first solution*/
        LinkedList<Integer> listWithAdditionalElement = new LinkedList<>();
        int temp;
        for (int i=0;i<list.size()+1;i++) {
            if (i <= 1) {
                listWithAdditionalElement.add(list.get(i));
            } else if (i==2) {
                listWithAdditionalElement.add(22);
            } else if (i<=list.size()-2) { //max 7
                listWithAdditionalElement.add(list.get(i-1));
            } else {
                listWithAdditionalElement.add(list.get(i-1));
            }
        }

        long endTimeFirstSolution = System.nanoTime();
        long finalDurationFirstSolution = endTimeFirstSolution - startTimeFirstSolution; /**Duration for the first solution*/

        /**
         *
         * Second solution
         *
         * */
        long startTimeSecondSolution = System.nanoTime(); /**Start counting duration for second solution*/
        LinkedList<Integer> listFirstPart = new LinkedList<>();
        LinkedList<Integer> listSecondPart = new LinkedList<>();
        LinkedList<Integer> listFinalPart = new LinkedList<>();

        for (int j=0;j<2;j++){
            listFirstPart.add(list.get(j));
        }
        for (int k=2;k<list.size();k++){
            listSecondPart.add(list.get(k));
        }

        listFinalPart.addAll(listFirstPart);
        listFinalPart.add(22);
        listFinalPart.addAll(listSecondPart);

        long endTimeSecondSolution = System.nanoTime();
        long finalDurationSecondSolution = endTimeSecondSolution - startTimeSecondSolution; /**Duration for the second solution*/

        System.out.println("Duration for first solution: " + finalDurationFirstSolution);
        System.out.println("Duration for second solution: " + finalDurationSecondSolution);
        System.out.println("Second solution final table: " + listFinalPart);
        return listWithAdditionalElement;
    }
}
