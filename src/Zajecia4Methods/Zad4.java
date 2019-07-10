package Zajecia4Methods;

/** Napisz metodę divide wyznaczającą iloraz dwóch zadanych liczb całkowitych.Działanie funkcji sprawdź pisząc odpowiedni program.
 * Dla chętnych *- Napiszmetodę z obsługą błędów. */

public class Zad4 {

    public static void main(String[] args) {

        int result = divide(6, 0);
        System.out.println(result);

        /*try {
            int result = divide(6, 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }*/

    }

    public static  int divide(int a, int b) {

        if (a != 0 && b != 0) {
            return a/b;
        }
            return -1;

    }

}
