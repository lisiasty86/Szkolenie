package Zajecia4Methods;

public class Zad10 {

    public static void main(String[] args) {

        maxStringLength("aabb", "ccddd");

    }

    public static int maxStringLength (String a, String b) {
        int length = 0;

        length = a.length();

        if (length >= b.length()) {
            System.out.println("Maksymalna dlugosc to: " + length);
        } else {
            length = b.length();
            System.out.println("Maksymalna dlugosc to: " + length);
        }

        return length;
    }

}
