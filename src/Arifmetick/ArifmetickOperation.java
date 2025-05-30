package Arifmetick;

import java.math.BigDecimal;
import java.util.Scanner;

public class ArifmetickOperation {


    private int numberOne;
    private int numberTwo;
    private double numberOfScannerOne;
    private double numberOfScannerTwo;
    static int count;
    private final static double PI = 3.14;
    public static int resultNumber;

    public ArifmetickOperation(int numberOneParam, int numberTwoParam) {
        this.numberOne = numberOneParam;
        this.numberTwo = numberTwoParam;
        resultNumber = numberOne + numberTwo;
        System.out.println(resultNumber);
    }

    @Override
    public String toString() {
        return "ArifmetickOperation{" +
                "numberOne=" + numberOne +
                ", numberTwo=" + numberTwo +
                '}';
    }

    ArifmetickOperation() {
        System.out.println("Введи первое число:");
        numberOfScannerOne = new Scanner(System.in).nextDouble();
        System.out.println("Введи второе число:");
        numberOfScannerTwo = new Scanner(System.in).nextDouble();
    }

    static BigDecimal multiplication(double firs, double second, double third) {
        BigDecimal resultBig = new BigDecimal(firs * second * third);
        count++;
        return resultBig;
    }

    static BigDecimal multiplication(double firs, double second) {
        return multiplication(firs, second, 0);
    }

    static void remainderStat(double first, double second) {
        double result = first % second;
        System.out.printf("Остаток от деления:" + result);
        count++;
    }

    static void countCircle(double radius) {
        double L = 2 * PI * radius;
        System.out.println("Длинна окружности будет:" + L);
    }

    void division() {

        remainderStat(numberOfScannerOne, numberOfScannerTwo);
        double resDev = numberOfScannerOne / numberOfScannerTwo;
        BigDecimal mult = multiplication(numberOfScannerOne, numberOfScannerTwo);
        System.out.println("\nЦелое частное от деления :" + (int) resDev + "\n" + "Результат умножения :" + mult);
        count++;
    }

    void countSquare(double radius) {
        double P = PI * radius * radius;
        System.out.println("Площадь круга равна :" + P);
    }

    void counAllParam(double radius) {
        System.out.println("_______________________________________");
        System.out.println("Радиус окружности :" + radius);
        countCircle(radius);
        countSquare(radius);
    }

}
