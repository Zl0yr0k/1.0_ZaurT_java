package oop.animals;

public class Test {
    public static void main(String [] args)  {
        Dog dog = new Dog("Sharik");
        System.out.println("У собак лап: ".concat(String.valueOf(dog.pow)));

        Cat cat = new Cat("Barsik");
        cat.sleeps();

        Rabbit rabbit = new Rabbit();
        rabbit.setHear("Mouth");
        System.out.println(rabbit.getHear());
    }

}
