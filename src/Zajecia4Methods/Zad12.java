package Zajecia4Methods;

public class Zad12 {

    public static void main(String[] args) {

        System.out.println(isItCube(64));

    }

    public static boolean isItCube (int x) {
        boolean isItCube = false;

        for (int i=1; i<x; i++) {
            if ((Math.pow(i, 3)) == x) {
                System.out.println(i);
                isItCube = true;
            }
            //System.out.println(i);
        }

        return isItCube;
    }

}
