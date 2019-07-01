package com.itfox;

import java.util.Scanner;

public class ZadRek3 {


    public static void main(String[] args) {


        int a;
        int b;

        Scanner zmienna = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        a = zmienna.nextInt();
        System.out.println("Podaj druga liczbe");
        b = zmienna.nextInt();
        int c = 0;

        System.out.println("\n" + "Wszystkie kwadraty z zakresu");

        for (int i=a; i <=b; i++) {
            //System.out.println(i);

            if (Math.sqrt(i)%1==0.0f){
                System.out.println(i + "   " + "--->    " + Math.sqrt(i));
                c++;
            }


        }

        System.out.println("\n" + "Poprawny wynik to: " + c);
        
        
    }

    
}
