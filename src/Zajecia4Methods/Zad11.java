package Zajecia4Methods;

public class Zad11 {

    public static void main(String[] args) {

        System.out.println(numberOfDivider(6));

    }


    public static int numberOfDivider (int number) {
        int numberOfDevicers = 0;


        for (int i=1; i<number; i++) {
            if (number % i == 0 ) {
                numberOfDevicers++;
            }
        }


        return numberOfDevicers;
    }

}
