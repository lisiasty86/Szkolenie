package zajecia5Tables;

public class Zad9 {

    public static void main(String[] args) {


        int[] table1 = {1,2,3,4,5};
        System.out.println(reverseTable(table1));

    }

    public static int[] reverseTable (int[] table) {
        int[] reverseTable = new int[table.length];

        for (int i=0; i<table.length; i++) {
            reverseTable[(reverseTable.length-1)-i] = table[i];
        }

        for (int j=0; j<reverseTable.length; j++) {
            System.out.println(reverseTable[j]);
        }
        return reverseTable;
    }

}
