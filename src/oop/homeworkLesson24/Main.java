package oop.homeworkLesson24;

public class Main {
   public static void main(String[] args) {
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
        System.out.println("___________________________________");

        Penguin penguin1 = new Penguin("Br");
        Bird bird1 = new Penguin("Dr");
        Animal animal1 = new Penguin("Zs");
        Speakable speakable1 = new Penguin("Wd");

        Penguin penguin2 = (Penguin)bird1;
        Penguin penguin3 = (Penguin)animal1;
        Penguin penguin4 = (Penguin)speakable1;
        ((Penguin) bird1).abc2();
        ((Penguin) animal1).abc2();
        ((Penguin) speakable1).abc2();
        penguin2.abc2();
        penguin3.abc2();
        penguin4.abc2();


        Bird bird2 = (Bird)animal1;
        Bird bird3 = (Bird)speakable1;
        System.out.println( bird2.name);
        bird2.eat();
        ((Penguin) animal1).fly();
        bird3.speak();


        Speakable speakable3 = (Speakable) bird1;
        Speakable speakable2 = (Speakable) animal1;
        Speakable speakable4 = (Speakable) penguin1;
        speakable2.speak();
        speakable3.speak();




        Object[] speakables = new Object[]{
               penguin1, penguin2,penguin3,penguin4, bird1,bird2,bird3,speakable1,speakable2,speakable3,speakable4,animal1
        };
        Animal [] animals = new Animal[] {};
        int z =0;

        for (Object o : speakables){
             if(o instanceof Penguin){
                  System.out.println("Is penguin " + z);
                  z++;
             }
        }
    }
}
