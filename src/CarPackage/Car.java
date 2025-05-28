package CarPackage;

public class Car {
    private String color;
    private String engine;
    private int amountOfDoorsObject;

    Car () {}

    public  Car (String colorParam, String engineParam,int amountOfDoorsParam) {
        this.color = colorParam;
        this.engine = engineParam;
        this.amountOfDoorsObject = amountOfDoorsParam;
    }

    public Car getCar(int doors ) {
        return new Car (color,engine,doors);
    }

    public String changeColor (String color) {
        return this.color = color;
    }
    public  void changeColor (Car carParam) {
        this.color = carParam.color;
    }
    public int changeDoors (int doors) {
        return  this.amountOfDoorsObject = doors;
    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", amountOfDoorsObject=" + amountOfDoorsObject +
                '}';
    }
}
