package oop.animals;

public class Dog extends Pet {

    Dog(String name) {
        System.out.println("I am dog and my name is " + name);
    }

    static String type = "small";

    void play() {
        System.out.println("Dog plays");

    }
}
