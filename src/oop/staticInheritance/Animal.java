package oop.staticInheritance;

public class Animal {
    static String showName () {
        return "some Animal";
    }

    void showInfoAboutAnimal () {
        System.out.println("Info about animal: " + showName());
    }
}
