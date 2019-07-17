package zajecia5Tables;

public class Zad18 {

    public static void main(String[] args) {
        int[] table1 = {1,1,1,1,2,2,2,3,4,5,6,6,6,6,6,7,8,8,8,8,8,8,8,8,8,9,9,9,0};
        int number = 6;

        System.out.println("Liczba: " + number + " wystepuje " + numberOfExistence(number, table1) + " razy w tabeli");
    }

    public static int numberOfExistence(int number, int[] table) {
        int counter = 0;

        for (int i=0; i<table.length; i++) {
            if (table[i] == number) {
                counter++;
            }
        }

        return counter;
    }
}
