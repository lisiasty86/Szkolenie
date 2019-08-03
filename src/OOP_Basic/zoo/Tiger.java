package OOP_Basic.zoo;

public class Tiger extends Animal {
    int clawLength;

    public Tiger(String name, float weight, int clawLength) {
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
        return "Tiger{" +
                "clawLength=" + clawLength +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void introduce() {
        System.out.println("I'm Bear. My name is " +
                this.name +
                ". I weight" +
                this.weight +
                "kg and my claw length is " +
                clawLength + ".");
    }
}
