package com.itfox;

import java.util.Scanner;

public class ZadString {


    public static void main(String[] args) {

/*        *//**ZAD1*//*
        String wyraz1 = "Programowanie";
        String wyraz2 = "jest ";
        String wyraz3 = "super ";

        String wyrazyRazem = wyraz3+wyraz2+wyraz1;

        System.out.println(wyrazyRazem);

        *//**ZAD2*//*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie ");
        String imie = scanner.nextLine();
        System.out.println(imie.length());

        *//**ZAD3*//*
        String wzor = "Programowanie";
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("podaj wyraz");
        String wyraz = scanner2.nextLine();
        boolean a = wyraz.equals(wzor);
        System.out.println(a);*/

/*      *//**ZAD4*//*
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Podaj imie2 ");
        String imie2 = scanner3.nextLine();
        String imieDuzeLitery = imie2.toUpperCase();
        System.out.println(imieDuzeLitery);*/

/*        *//**ZAD5*//*
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Podaj imie3");
        String imie3 = scanner4.nextLine();
        char x = imie3.charAt(0); //zamiast charAt mozna uzyc startWith()
        char y = 'W';
        boolean a = x==y;
        System.out.println(a);*/

        /**ZAD6*/
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String slowo = scanner5.nextLine();
        String pies = "pies";
        boolean z = slowo.contains(pies);
        System.out.println(z);
    }
}
