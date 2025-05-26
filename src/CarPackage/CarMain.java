package CarPackage;

import static CarPackage.CarTest.*;

public class CarMain {
    public static void main(String[] args) {

        Car ford = new Car("red","v6",5);
        CarTest.changeAmountOfDoors(ford, 6);
        System.out.println(ford.toString());


        Car toyota = ford.getCar(7);
        toyota.changeColor("blue");
        System.out.println(toyota.toString());

        CarTest.changeColorofObject(ford, toyota);
        System.out.println(ford.toString());
        System.out.println(toyota.toString());








    }
}
