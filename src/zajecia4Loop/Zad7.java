package zajecia4Loop;

import java.util.*;

/** Napisz program, który losuje 6 liczb z Dużego Lotka. */

public class Zad7 {

    public static void main(String[] args) {

        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;
        int number6 = 0;

        int firstNumberToComaper;
        int secondNumberToCompare;

        ArrayList<Integer> numbersGivenByUser = new ArrayList<Integer>();

        ArrayList<Integer> numbersDrawByProgram = new ArrayList<Integer>();

        ArrayList<Integer> numberGuessedByUser = new ArrayList<Integer>();

        int[] numbersArray = new int[6];

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        for (int j=0; j<6; j++) {
            System.out.println("Podaj liczbe numer: " + j);
            numbersGivenByUser.add(scanner.nextInt());
        }
        System.out.println("Numery ponade przez usera: " + numbersGivenByUser);


        for (int i=0; i<6; i++) {

            //numbersArray[i] = random.nextInt(10);
            Integer next = random.nextInt(20);
            numbersArray[i] = next;
            //System.out.print(numbersArray[i] + ", ");
            numbersDrawByProgram.add(numbersArray[i]);

        }
        System.out.println("Numery wylosowane przez system: " + numbersDrawByProgram);

        for (int k=0; k<=5; k++) {
            firstNumberToComaper = numbersGivenByUser.get(k);
            //System.out.println(firstNumberToComaper);

            for (int l=0; l<=5; l++) {
                secondNumberToCompare = numbersDrawByProgram.get(l);
                //System.out.println(secondNumberToCompare);

                if (firstNumberToComaper==secondNumberToCompare) {

                    if (numberGuessedByUser.equals(secondNumberToCompare)) {
                        continue;
                    } else {
                        numberGuessedByUser.add(secondNumberToCompare);
                    }


                }
            }
        }
        System.out.println("Liczby trafione: ");

        for (int n=0; n<=numberGuessedByUser.size()-1; n++) {
            System.out.println(numberGuessedByUser.get(n));
        }


    }

}
