package zajecia5Tables;

public class Zad2 {

    public static void main(String[] args) {
        int[] table = {1,2,3,4,5,6,7};
        System.out.println(lastTableElement(table));

    }

    public static int lastTableElement (int[] table) {
        int x = table[table.length-1];
        return x;
    }

}
