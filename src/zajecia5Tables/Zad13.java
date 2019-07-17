package zajecia5Tables;

public class Zad13 {

    public static void main(String[] args) {
        String[] table1 = new String[6];
        table1[0] = "Java";
        table1[1] = "Python";
        table1[2] = "Haskell";
        table1[3] = "C++";
        table1[4] = "PLSQL";
        table1[5] = "Javascript";


        allWordsWIthAtLeast5Character(table1);

    }

    public static String[] allWordsWIthAtLeast5Character(String[] table) {
        String[] finalTable = new String[table.length];
        int j = 0;

        for (int i=0; i<table.length; i++) {
            if (table[i].length() >=5) {
                finalTable[j] = table[i];
                System.out.println(finalTable[j]);
                j++;
            }
        }
        return finalTable;
    }
}
