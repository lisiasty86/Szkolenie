package Zajecia4Methods;

public class Zad16 {

    public static void main(String[] args) {

        System.out.println(isPesel("86120704265"));

    }

        public static boolean isPesel (String number) {

        if (number.length() != 11) {
            return false;
        }

        for (int i=0; i<number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))){
                return false;
            }
        }
        return true;
        }
}
