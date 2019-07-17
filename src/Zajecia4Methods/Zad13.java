package Zajecia4Methods;

public class Zad13 {

    public static void main(String[] args) {

        System.out.println(isPrimeNumber(7));

    }

    public static boolean isPrimeNumber (int x) {
        boolean isPrime = true;

        for (int i=2; i<x; i++) {
            if (x % i == 0) {
                isPrime = false;
            }
        }

        return isPrime;
    }

}
