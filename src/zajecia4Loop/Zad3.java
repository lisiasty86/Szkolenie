package zajecia4Loop;

/** Napisz program, który wypisuje liczby od 5 do 50, które są nieparzyste. */

public class Zad3 {

    public static void main(String[] args) {

        int number = 5;

        for (int i=5; i<=50; i++) {
            if (number%2!=0) {
                System.out.println(number);
            } number++;
        }

    }

}
