package OOP_Basic.zoo;

public class Dog extends Animal implements Canine {
    int furLength = 40;

    public Dog(String name, float weight, int furLength) {
        super(name, weight);
        this.furLength = furLength;
    }

    public int getFurLength() {
        return furLength;
    }

    public void setFurLength(int furLength) {
        this.furLength = furLength;
    }

    @Override
    public void bark() {
        System.out.println("My name is " + this.name + " bark, bark, bark, bark, bark, bark");

    }

    public void sitPretty() {
        System.out.println(name + " sits pretty.");
    }

    @Override
    public void introduce() {
        System.out.println("I'm dog. My name is " +
                this.name +
                ". I weight" +
                this.weight + ".");
    }
}
