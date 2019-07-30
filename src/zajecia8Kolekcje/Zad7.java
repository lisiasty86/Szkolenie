package zajecia8Kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad7 {

    public static void main(String[] args) {
        List<String> colorsList = new ArrayList<>(Arrays.asList("blue", "green", "yellow", "white", "black"));
        String color = "tdsv";
        System.out.println(findIndexOfColor(color, colorsList));
    }

    public static int findIndexOfColor(String color, List<String> colors) {
        int indexOfColor = -1;
        String colorToCheck = color;
        for (int i=0;i<colors.size();i++){
            if (colorToCheck == colors.get(i)){
                indexOfColor = i;
            }
        }
        return indexOfColor;
    }

}
