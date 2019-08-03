package OOP_Basic.zoo;

public class Wolf extends Animal implements Canine{
    int clawLength;

    public Wolf(String name, float weight, int clawLength) {
        super(name, weight);
        this.clawLength = clawLength;
    }

    public int getClawLength() {
        return clawLength;
    }

    public void setClawLength(int clawLength) {
        this.clawLength = clawLength;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "clawLength=" + clawLength +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void bark() {
        System.out.println("My name is " + this.name + " BARK, BARK, BARK, BARK");
    }

    @Override
    public void introduce() {
        System.out.println("I'm wolf. My name is " +
                this.name +
                ". I weight" +
                this.weight +
                "kg and my claw length is " +
                clawLength + ".");
    }
}
