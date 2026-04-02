package oop.animals;

public class Animal {

    Animal() {
        //по сути эта перегрузка здесь не нужна, но мне нужно посмотреть как это работает
        this(0, null);
        System.out.println("I am animal");
    }

    Animal(int group) {
        this(group, null);
    }

    Animal(int group, String subGroup) {
        if (group < 0) {
            System.out.println("Bad data ");
        }
    }

    int eyes;

    static String type = "big";

    protected void eat() {
        System.out.println("Animal eats");
    }

    void drink() {
        System.out.println("Animal drinks");
    }
}
