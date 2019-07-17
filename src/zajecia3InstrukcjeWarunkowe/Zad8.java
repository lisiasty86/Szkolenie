package zajecia3InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int wordLength = word.length();
        String firstLetter = word.substring(0,1);
        String lastLetter = word.substring(wordLength-1);
        //boolean a = word.substring()


        System.out.println(lastLetter);
        System.out.println(firstLetter);

        if (firstLetter.equals(lastLetter)) {
            System.out.println("Pierwsza i ostatnia litera jest taka sama");
        } else {
            System.out.println("Pierwsza i ostatnia litera sa rozne");
        }

    }

}
