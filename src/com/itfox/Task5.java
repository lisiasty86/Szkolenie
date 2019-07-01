package com.itfox;

import java.util.Scanner;

public class Task5 {

    //psvm
    public static void main(String[] args) {



        Scanner wczytaj = new Scanner(System.in);

        System.out.println("podaj liczbe1");

        int liczba1 = wczytaj.nextInt();

        //5System.out.println(liczba1);

        System.out.println("podaj liczbe2");

        int liczba2 = wczytaj.nextInt();

        double average = (liczba1 + liczba2)/2.0;

        double quotient = (double)liczba1/liczba2;

        System.out.println(quotient);

        /*

            Co sie dzieje w przypadku niezgodnych typow, ktore sa liczbami
            int dodaje do double?
            4+5.3?
            jesli wykonujemy operacje na liczbach z niezgodnym typem to wykona sie niejawna konwersja do typu bardziej dokladnego
            4+5.3 = 9.3

         */




    }

}
