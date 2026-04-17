package oop.homeworkLesson24;

public class Main {
    static void main() {
        Mechenosec mech = new Mechenosec("Tihon");
        mech.eat();
        mech.swim();
        mech.sleep();

        System.out.println("____________________________");

        Speakable spek = new Penguin("Took");
        spek.speak();

        System.out.println("______________________________");

        Animal animalLion = new Lev("Petr");
        System.out.println(animalLion.name);
        animalLion.sleep();
        animalLion.eat();

        System.out.println("_______________________________");

        Mammal mammalLion = new Lev("Timofey");
        System.out.println(mammalLion.name);
        mammalLion.run();
        mammalLion.sleep();
        mammalLion.speak();
        mammalLion.eat();
    }
}
