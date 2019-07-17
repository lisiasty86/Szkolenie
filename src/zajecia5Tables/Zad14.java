package zajecia5Tables;

public class Zad14 {

    public static void main(String[] args) {
        String[] table1 = new String[6];
        table1[0] = "Java";
        table1[1] = "Python";
        table1[2] = "Haskell";
        table1[3] = "C++";
        table1[4] = "PLSQL";
        table1[5] = "Javascript";

        smallLettersTable(table1);
    }

    public static String[] smallLettersTable(String[] table) {
        String[] smallLetterTable = new String[table.length];

        for (int i=0; i<table.length; i++) {
            smallLetterTable[i] = table[i].toLowerCase();
            System.out.println(smallLetterTable[i]);
        }

        return smallLetterTable;
    }

}
