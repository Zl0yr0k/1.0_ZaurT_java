package oop.homeworkLesson24;

public class Penguin extends Bird {

    String name;

    public Penguin (String name){
        super(name);
        this.name = name;
    }
    @Override
     void eat() {
        System.out.println("Penguin love to eat fish");
    }
    @Override
     void sleep() {
        System.out.println("Penguins like sleep each other");
    }
    @Override
    void fly () {
        System.out.println("Penguins can't fly");
    }
    @Override
    public void speak () {
        System.out.println("Penguins can't sing");
    }

}
