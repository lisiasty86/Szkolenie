package zajecia5Tables;

public class Zad5 {

    public static void main(String[] args) {

        int[] table = {1,2,3,4,5};
        int[] table2 = {5,6,7,8,9,10};


        System.out.println(middleOfTable(table));
        System.out.println(middleOfTable(table2));
    }

    public static int middleOfTable (int[] table) {
        int middle = 0;

        middle = table[(table.length-1)/2];

        return middle;
    }

}
