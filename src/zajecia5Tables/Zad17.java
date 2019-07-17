package zajecia5Tables;

import java.util.Arrays;

public class Zad17 {

    public static void main(String[] args) {
        boolean[] table1 = new boolean[5];
        //Arrays.fill(table1, Boolean.FALSE);
        table1[0] = true;
        table1[1] = false;
        table1[2] = false;
        table1[3] = true;
        table1[4] = false;


        System.out.println(Arrays.toString(finalTable(table1)));

    }

    public static boolean[] finalTable(boolean[] table) {

        int counter = 0;
        int k = 0;

        for (int i=0; i<table.length; i++) {
            if (table[i] == true) {
                counter++;
            }
        }

        boolean[] finalTable = new boolean[counter];
        for (int j=0; j<table.length; j++) {
            if (table[j] == true) {
                finalTable[k] = table[j];
                k++;
            }
        }

        return finalTable;
    }

}
