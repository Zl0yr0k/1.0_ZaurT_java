package oop.homeworkLesson24;

public class Mechenosec extends Fish{

    String name;

    public Mechenosec (String name) {
        super(name);
        this.name = name;
    }
    @Override
    void swim () {
        System.out.println("This is beautiful fish? which can swim very fast");
    }
    @Override
    void eat () {
        System.out.println("This is not predator and it can eat fish food");
    }


}
