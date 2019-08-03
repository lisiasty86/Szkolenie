package OOP_Basic.basic;

import OOP_Basic.basic.factory.CarFactory;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

/*        Car car = new Car();
        car.generateDoors();*/

        CarFactory carFactory = new CarFactory();
        carFactory.generateCar();
        carFactory.generateVolvoCar();

        /**
         * OOP:
         * - klasy, metody, obiekty
         * - konstruktory
         * - parametry
         * - dziedziczenie
         * - argumenty metod
         * - slowa kluczowe
         *
         * */

    }

}
