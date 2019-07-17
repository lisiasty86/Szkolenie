package zajecia5Tables;

public class Zad15 {

    public static void main(String[] args) {
        String[] table1 = new String[6];
        table1[0] = "Java";
        table1[1] = "Python";
        table1[2] = "Haskell";
        table1[3] = "C++";
        table1[4] = "PLSQL";
        table1[5] = "Javascript";

        System.out.println(numberOfCharactersInWord(table1));
    }

    public static int numberOfCharactersInWord(String[] table) {
        int numberOfCharacters = 0;

        for (int i=0; i<table.length; i++) {

            if (table[i].length() >= numberOfCharacters) {
                numberOfCharacters = table[i].length();
            }

        }

        return numberOfCharacters;
    }

}
