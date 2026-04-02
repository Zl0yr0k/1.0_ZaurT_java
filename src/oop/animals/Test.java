package oop.animals;

public class Test {
    public static void main(String [] args)  {
        Dog dog = new Dog("Sharik");
        System.out.println("У собак лап: ".concat(String.valueOf(dog.pow)));

        Cat cat = new Cat("Barsik");
        cat.sleeps();

        Animal animal = new Animal();
        Animal pet = new Pet();
        Animal animalDog = new Dog("Tobik");
        Animal animalCat = new Cat("Tish");

        //animal cat
        animalCat.eyes = 4; //animal
        animalCat.eat();    //animal protected
        animalCat.drink();  //animal
        // animalCat.sleeps(); - этот метод находиться в Cat и он не виден
        //animalCat.tail  - это переменная в Pet  и ее тоже не видно


        //pet cat or animal
        //pet.run - нет, не доступен
        pet.drink();
        pet.eyes = 3;
        pet.eat();

        animal.eat();


        Pet petCat = new Cat("Gamma");
        Pet petDog = new Dog("Sharik");

        petCat.run();
        petCat.tail = 1;
        petCat.drink();
        petCat.eat();
        //petCat.sleep(); -такого метода нет потому что в классе выше.
        // Тип переменной ограничивает видимость методов и переменныхю
        // Видно только то что в классе кокого типа переменная и то что
        //унаследовано от родителя


        Animal an = new Animal();
        Pet petHeight = new Pet();
        Dog dogHeight = new Dog ("Gav");


        //static переменные не перезаписываются
        System.out.println(Animal.type);
        System.out.println(Pet.type);
        System.out.println(Dog.type);

        Snacks snack = new Snacks();
        snack.setName("Petya");
        System.out.println(snack.getName());

        Rabbit rabbit = new Rabbit();
        rabbit.setHear("Mouth");
        System.out.println(rabbit.getHear());
    }

}
