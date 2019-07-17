package zajecia5Tables;

public class Zad3 {

    public static void main(String[] args) {
        //int[] table = new int[2];
        int [] table = new int [2];
        table[0] = 1;
        table[1] = 5;
        System.out.println(sumOfTableElements(table));

    }

    public static int sumOfTableElements (int[] table){
        int result = 0;
        result = table[0] + table[1];
        return result;
    }

}
