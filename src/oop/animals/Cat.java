package oop.animals;

public class Cat extends Pet {
    Cat(String name) {
        System.out.println("I am a cat and my name is " + name);
    }

    void sleeps() {
        System.out.println("Cat sleeps");
    }

}
