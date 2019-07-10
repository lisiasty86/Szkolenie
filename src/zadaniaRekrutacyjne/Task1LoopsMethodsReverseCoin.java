package zadaniaRekrutacyjne;

import java.util.Arrays;

public class Task1LoopsMethodsReverseCoin {

    public static void main(String[] args) {

        int [] A = {1,0,0,1,0,0,0,1,1};
        task1LoopsMethodsReverseCoin(A);
    }

    public static int task1LoopsMethodsReverseCoin(int[] A){
        int result = 0;
        int[] arrays = A;
        int checker = 0;
        boolean arrayLengthChecker = false;

        if (1 > arrays.length || arrays.length > 100  ) {
            System.out.println("Liczba elementow tablicy nie spelnia warunku \"1 < rozmiar tablicy < 100\"");
        } else {

            for (int x=0; x <= arrays.length-1; x++) {
                if (arrays[x] != 0 && arrays[x] != 1) {
                    System.out.println("Doposzczalne wartosci w tablicy to 0 i 1. Prosze poprawic dane");
                    break;
                }
            }

            System.out.println("Tablica wyjsciowa:");
            for (int i=0; i<=arrays.length-1; i++){
                System.out.print(arrays[i]);
                if (arrays[i] > checker) {
                    result++;
                    arrays[i] = 0;
                } else {
                    continue;
                }
            }
            System.out.println("\n" + "\n" + "Tablica po zmaianach:");
            for (int j=0; j<=arrays.length-1; j++){
                System.out.print(arrays[j]);
            }
            System.out.println("\n" + "\n" + "Tyle razy trzeba bylo przestawic monete: " + result);

        }
        return result;
    }
}
