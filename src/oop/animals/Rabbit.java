package oop.animals;


import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rabbit extends Animal{

    private final int number = 3;
    private String hear= "Hear";

    @Override
    protected void eat() {
        System.out.println("Rabbit eats");
    }

    @Override
    protected void drink() {
        System.out.println("Rabbit drinks");
    }



}
