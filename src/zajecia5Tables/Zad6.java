package zajecia5Tables;

public class Zad6 {

    public static void main(String[] args) {

        int[] table1 = {1,2,3};
        int[] table2 = {4,5,6};

        sumOfTables(table1, table2);

    }

    public static int[] sumOfTables(int[] table1, int[] table2) {
        int[] sumTable = new int [6];

        for (int i=0; i<table1.length; i++) {
            sumTable[i] = table1[i];
        }

        for (int j=0; j<table2.length; j++) {
            sumTable[sumTable.length/2+j] = table2[j];
        }



        for (int k=0; k<sumTable.length; k++) {
            System.out.println(sumTable[k]);
        }

        return sumTable;
    }

}
