package Zajecia4Methods;

public class Zad9 {

    public static void main(String[] args) {

        System.out.println(stringSum("aaa", "bbb"));

    }

    public static String stringSum (String a, String b) {

        String sum = "";

        sum = a.concat(b);

        return sum;
    }

}
