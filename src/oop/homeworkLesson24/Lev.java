package oop.homeworkLesson24;

public class Lev extends Mammal {
    String name;

    public Lev (String name) {
        super(name);
    }

    @Override
    void eat () {
        System.out.println("Lion is just like someone predator like meat");
    }

    @Override
    void sleep () {
        System.out.println("Lion like slipping a lot of time");
    }
    @Override
    void run () {
        System.out.println("It is not very fast");
    }
    @Override
    public void  speak () {
        System.out.println("Lev do rrrrrr");
    }
}
