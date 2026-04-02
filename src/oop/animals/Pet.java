package oop.animals;

public class Pet extends Animal {
    Pet() {
        System.out.println("I am pet");
        eyes = 2;
    }

    String name;
    int tail = 1;
    int pow = 4;

    static String type = "middle";

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("pet jumps");
    }


}
