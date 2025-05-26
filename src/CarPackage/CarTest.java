package CarPackage;


public class CarTest {

    static int changeAmountOfDoors(Car carParam, int newDoors) {
        return carParam.changeDoors(newDoors);
    }

    static void changeColorofObject(Car carParam1, Car carParam2) {
        Car swop = new Car();
        swop.changeColor(carParam1);
        carParam1.changeColor(carParam2);
        carParam2.changeColor(swop);
    }
}
