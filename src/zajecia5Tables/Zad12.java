package zajecia5Tables;

public class Zad12 {

    public static void main(String[] args) {

        int[] table = {1,2,3,4};

        System.out.println(createTableOfMiddleElements(table));

    }

    public static int[] createTableOfMiddleElements(int[] table) {
        int[] tableWithMiddleElements = new int[table.length-2];
        //int helper = (table.length-1)/2;
        for (int i=1; i<table.length-1;i++) {

            tableWithMiddleElements[i-1] = table[i];
            System.out.println(tableWithMiddleElements[i-1]);

        }

        return tableWithMiddleElements;
    }

}
