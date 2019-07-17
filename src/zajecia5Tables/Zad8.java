package zajecia5Tables;

public class Zad8 {

    public static void main(String[] args) {

        int[] table1 = {1,6,9,24,37,2,0};

        System.out.println(theBiggestElementOfArray(table1));

    }

    public static int theBiggestElementOfArray (int[] table) {
        int maxElement = 0;

        for (int i=0; i<table.length; i++) {
            if (maxElement < table[i]) {
                maxElement = table[i];
            }
        }

        return maxElement;
    }

}
