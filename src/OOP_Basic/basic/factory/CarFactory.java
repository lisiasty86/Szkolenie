package OOP_Basic.basic.factory;

import OOP_Basic.basic.cars.Car;

public class CarFactory {

    public void generateCar() {
        Car car = new Car(4, 5, 2.0, "VW", "Jetta", "Diesel");
/*        car.wheels = 4;
        car.brand = "Ford";
        car.doors = 5;
        car.fuel = "Gasoline";
        car.model = "Focus";
        car.engineCapacity = 1.9;*/
        car.setWheels(3);

        System.out.println(car);
    }

    public void generateVolvoCar() {
        Car volvoCar = new Car(4, 5, 2.0, "Volvo", "XC90", "Hybrid");

        System.out.println(volvoCar);
    }



}
