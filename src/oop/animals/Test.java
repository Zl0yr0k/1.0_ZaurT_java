package oop.animals;

public class Test {
    static void main() {
        Dog dog = new Dog("Sharik");
        System.out.println(STR."У собак лап \{dog.pow}");

        Cat cat = new Cat("Barsik");
        cat.sleeps();

        Rabbit rabbit = new Rabbit();
        rabbit.setHear("Mouth");
        System.out.println(rabbit.getHear());
    }
}
