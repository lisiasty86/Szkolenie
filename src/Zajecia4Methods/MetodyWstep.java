package Zajecia4Methods;

import java.util.Scanner;

public class MetodyWstep {

    /** Metoda, to worek grupujacy zestaw instrukcji.
     * Kod grupujemy w metody poniewaz chcemy wykonac dany zestaw instrukcji
     * w kilku miejscach w programie oraz chcemy tworzyc czytelniejsze programy.
     * */

    //wykonywalny blok kodu
    public static void main(String[] args) {



        getName();
        getSum();

    }
    //koniec wykonywalnego bloku kodu

    //deklaracje metody
    public static void getName() {
        System.out.println("Lukasz");
    }

    public static void getSum() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe");
        int num1 = scanner.nextInt();

        System.out.println("Podaj druga liczbe");
        int num2 = scanner.nextInt();

        System.out.println("Podaj trzecia liczbe");
        int num3 = scanner.nextInt();

        System.out.println(num1 + num2 + num3);
    }

    //public --> modyfikator dostepu
    //static --> opcja okreslajaca tym metody
    //void --> typ zwracany, void oznacza brak zwracanego typu (wyjatek)
    //getName --> nazwa dowolna metody
    // () --> przyjmuje argumenty metody, czyli zmienne, ktore sa potrzebne do dzialania metody
    // { ... } --> cialo metody
    //argument metody: <typ zmiennej> <nazwa zmiennej> jesli mamy dwa i wiecej argumentow to podajemy je po przecinku

}
