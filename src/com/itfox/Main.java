package com.itfox;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
        //zad 1
        System.out.println("Akademia kodu");

        //zad 2
        System.out.println(5000);

        double score = 5005.25;
        System.out.println(score);

        //zad 3
        System.out.println("5000.25");
        System.out.println("5002,25");*/


        String hello = "  Hello World!  ";
        System.out.println(hello);

        /** trim() - zadaniem metody jest pozbycie sie wszystkich bialych znkow na poczatku i na koncu stringa*/

        String hello2 = hello.trim();
        System.out.println(hello2);

        /** toUpperCase() - metoda ma za zadanie zamienic wszystkie znaki na wielkie litery*/
        String hello3 = hello.toUpperCase();
        System.out.println(hello3);

        /** toLowerCase() - metoda ma za zadanie zamienic wszystkie znaki na male litery*/
        String hello4 = hello.toLowerCase();
        System.out.println(hello4);

        /** isEmpty() - metoda ma za zadanie sprawdzic czy string jest pusty*/
        boolean b = hello.isEmpty();
        System.out.println(b);

        /** length() - metoda ma za zadanie wyswietlic dlugosc ciagu znakow*/
        int c = hello.length();
        System.out.println(c);

        /** charAt() - metoda ma za zadanie zwrocic znak znajdujacy sie pod wskazanym indeksem*/
        char a = hello.charAt(5);
        System.out.println(a);

        /** toCharArray() - metoda ma za zadanie zwrocic tablice wszystkich znakow skladajacych sie na ciag znakow*/
        char[] tablica = hello.toCharArray();
        System.out.println(tablica);

        String[] cos = new String[] {"Hello World!"};
        System.out.println(cos);

        /** subString() - metoda ma za zadanie zwrocic wybrany fragment ciagu znakow o podanym zakresie indeksow*/
        String substringresult = hello.substring(6);
        System.out.println(substringresult);

        String substringResultTwoIndexes = hello.substring(3,8);
        System.out.println(substringResultTwoIndexes);

        CharSequence cos2 = hello.subSequence(3,8);
        System.out.println(cos2);

        /** split() - metoda dzieli wyraz string na podstawie okreslonego wzorca*/
        String sentence = "Ala ma kota i psa";
        String[] words = sentence.split(" ", 2);
        System.out.println(words.length);
        System.out.println(words[1]);

        /** replace() - metoda sluzy do zmiany jednego fragmentu tekstu na drugi*/
        String newHello = hello.replace("H", "O");
        System.out.println(newHello);

        /** matches() - */
        boolean match = hello.matches("H"); // wyjasnienie bedzie podczas wyrazen regularnych
        System.out.println(match);

        /** indexOf() - wyszukuje podanego ciagu znakow i zwraca pierwszy index znalezionego wystapienia*/
        int indexStringa = hello.indexOf("H");
        System.out.println(indexStringa);

        /** equals() - metoda sluzy do porownywania ze soba stringow pod wzgledem wartosci a nie referencji.
         * Poniewaz stringi sa obiektami operator == nawet dla takich samych ciagow znakow moze zwrocic false.
         * Istnieje rowniez equalsIgnoreCase() ktora porownuje stringi z pominiecie wielkosci znakow.*/
        String string1 = "Hello";
        String string2 = "hello";

        boolean res1 = string1 == string2;
        boolean res2 = string1.equals(string2);

        System.out.println(res1);
        System.out.println(res2);

    }
}
