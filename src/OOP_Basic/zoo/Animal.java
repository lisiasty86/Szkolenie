package OOP_Basic.zoo;

public abstract class Animal {
    private int id;
    protected String name; //protected tu nie ma znaczenia bo jestesmy wewnatrz tego samego pakietu
    protected float weight;
    private static int COUNTER = 0; //statyczna zmienna powinna byc drukowanymi

    public Animal(String name, float weight) {
        this.id = ++COUNTER;
        this.name = name;
        this.weight = weight;
    }

    public abstract void introduce();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

/*    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }*/

}
