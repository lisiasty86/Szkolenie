package zadaniaRekrutacyjne;

public class Task3LoopsMethodsSumOfIntegers {

    public static void main(String[] args) {

        int[] A = {-1, 5, 188, -250, 29, -1000};
        task3LoopsMethodsSumOfIntegers(A);
    }

    public static  int task3LoopsMethodsSumOfIntegers(int[] A) {
        int result = 0;
        int[] array = A;
        int numberOfElement;
        int x = -1000;
        int y = 1000;
        boolean flag = false;

        if (array.length >= 1 && array.length <= 1000 ) {
            for (int i=0; i<=array.length-1; i++) {
                if (array[i] >= x && array[i] <= y) {
                    result = result + array[i];
                } else {
                    numberOfElement = i;
                    System.out.println("Wartosc elemenu: " + numberOfElement + " wynosi: " + array[i] + " i wykracza poza zakres --> \"-1000 <= x <= 1000\"");
                    flag = true;
                }
            }
        } else {
            System.out.println("Rozmiar tablicy wykracza poza przedzial --> \"1 <= rozmiar tablicy <= 1000\"");
        }

        if (flag == false) {
            System.out.println(result);
        }

        return result;
    }

}
