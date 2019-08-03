package OOP_Basic.basic.cars;

public class Car {

    //musimy okreslic skladniki Car. Czyli elementy, z ktorych sklada sie ten typ.

    private int wheels;
    private  int doors;
    private double engineCapacity;
    private String brand;
    private String model;
    private String fuel;

    public Car() {

    }

    public Car(int wheels, int doors, double engineCapacity, String brand, String model, String fuel) {
        this.wheels = wheels;
        this.doors = doors;
        this.engineCapacity = engineCapacity;
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", doors=" + doors +
                ", engineCapacity=" + engineCapacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
