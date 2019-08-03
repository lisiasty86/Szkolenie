package OOP_Basic.zoo;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Blant", 32, 1);
        Dog dog2 = new Dog("Scooby", 30, 1);
        Bear bear1 = new Bear("Yogi", 200, 40);
        Wolf wolf1 = new Wolf("Howler", 70, 40);
        Tiger tiger1 = new Tiger("Jataka", 150, 25);


        //System.out.println(dog1);
        //System.out.println(dog2.getId() + " " + dog2.getName());
        //System.out.println(bear1);
        bear1.introduce();
        tiger1.introduce();
        wolf1.introduce();
        dog2.introduce();
        wolf1.bark();
        dog2.bark();
        dog2.sitPretty();

        ;

    }

}
