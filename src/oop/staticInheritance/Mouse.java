package oop.staticInheritance;

public class Mouse extends Animal {
    static String showName () {
        return "Jerry";
    }

    void showInfoAboutMouse () {
        System.out.println("Info about animal: " + showName());
    }
}

