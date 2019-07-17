package zajecia5Tables;

public class Zad7 {

    public static void main(String[] args) {

        int[] table1 = {1,2,3,4,5,6};

        System.out.println(sumAllElements(table1));

    }

    public static int sumAllElements (int[] table) {
        int sum = 0;

        for (int i=0; i<table.length; i++) {
            sum = sum+table[i];
        }

        return sum;
    }


}
