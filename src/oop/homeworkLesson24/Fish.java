package oop.homeworkLesson24;

public abstract class Fish extends Animal {
    String name;

    public  Fish  (String name) {
        super(name);
        this.name = name;
    }
    @Override
    void sleep () {
        System.out.println("It's interesting how fish is sleep");
    }
    abstract void swim();
}
