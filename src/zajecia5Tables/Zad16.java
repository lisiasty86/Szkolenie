package zajecia5Tables;

public class Zad16 {

    public static void main(String[] args) {
        int[] table1 = {1,24,3,4,5,6,7,8,9,10,12};

        allNumbers(table1);
    }


    public static int[] allNumbers(int[] table) {
        int[] finalTable = new int[table.length];
        int helper1 = 0;
        int helper2 = 0;
        int finalTableIndex = 0;

        for (int i=0; i<table.length; i++) {
            for (int j=1; j<=table[i]; j++) {
                if (table[i]%j == 0) {
                    helper1++;
                }

            }
            System.out.println("Ilosc dzielnikow liczby: " + table[i] + " wynosi: " + helper1);
            if (helper1 >= helper2) {
                helper2 = helper1;
                helper1 = 0;
                if (finalTable[finalTableIndex] <= helper2) {
                    finalTable[finalTableIndex] = table[i];
                }
            } helper1 = 0;
        }                     System.out.println(finalTable[finalTableIndex]);
        return finalTable;
    }

}
