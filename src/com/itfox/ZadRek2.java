package com.itfox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZadRek2 {

    public static void main(String[] args) {

        //tablica temperatur i jej konwersja do listy
        Integer[] T = new Integer[]{-3, -14, -5, 7, 8, 42, 8, 3, -5, 7, 8, 42};
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(T));

        //tablica z porami roku i jej konwersja do listy
        String[] seasons = new String[]{"WINTER", "SPRING", "SUMMER", "AUTUMN"};
        List<String> seasonsList = new ArrayList<String>(Arrays.asList(seasons));

        //lista z amplitudami
        ArrayList<Double> amplitudes = new ArrayList<Double>();
        //liczba temperatur w kazdej z grup
        int numberOfTemperaturesInEachGroup = T.length / 4;
        //aktualna amplituda
        double amplitude = 0.0;
        //zmienna pomocnicza dozapisania nawyzszej amplitudy
        double temp = 0.0;

        if (T.length % 4 == 0) {
            for (int i = 0; i < T.length; i++) {
                System.out.println("i = " + i);
                amplitude = amplitude + list.get(i);
                if ((i + 1) % numberOfTemperaturesInEachGroup == 0) {
                    System.out.println("amplituda = " + amplitude / numberOfTemperaturesInEachGroup);
                    amplitudes.add(amplitude / numberOfTemperaturesInEachGroup);
                    if (temp < amplitude) {
                        temp = amplitude / numberOfTemperaturesInEachGroup;
                    }
                    amplitude = 0;
                }
            }
            for (double j : amplitudes) {
                System.out.println(j);
            }
            for (int k = 0; k < 4; k++) {
                if (amplitudes.get(k) == temp) {
                    System.out.println("Pora roku z najwieksza amplituda to: " + seasonsList.get(k) + " wynoszaca: " + temp);
                }
            }
        } else {
            System.out.println("Tablica nie może być podzielona na 4 pory roku.");
        }
    }
}
