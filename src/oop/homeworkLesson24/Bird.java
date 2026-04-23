package oop.homeworkLesson24;

public abstract class Bird extends Animal implements Speakable {

    String name;

    public Bird(String name){
        super(name);
        this.name = name;
    }
    @Override
    void eat() {
        System.out.println("Bird love to eat fish");
    }
    @Override
    void sleep () {
        System.out.println("Bird like sleep each other");
    }
    abstract void fly() ;

    @Override
    public void speak () {
        System.out.println(name + "sings");
    }

}
