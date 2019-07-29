package zajecia8Kolekcje;

/**
 * Napisz program, który zamienia liczbę całkowitą na liczbę w systemie binarnym.
 * Przykładowo dla danych:
 * 5
 * Wynikiem powinno byc:
 * 101
 * */

public class Zad5 {

    public static void main(String[] args) {

        System.out.println(toBinaryValue(5));

    }

    public static String toBinaryValue(int number) {
        String binaryValue;
        Integer helper = Integer.valueOf(number);

        binaryValue = Integer.toBinaryString(helper);
        return binaryValue;
    }

}
