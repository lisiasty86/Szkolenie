package zajecia5Tables;

public class Zad4 {

    public static void main(String[] args) {


        int[] table = {1,2,3,4,5,6,7};
        System.out.println(sumOfElements(table));

    }

    public static int sumOfElements(int[] table) {
        int sum = 0;
        int first = table[0];
        int second = table[table.length-1];

        sum = first+second;

        return sum;
    }

}
