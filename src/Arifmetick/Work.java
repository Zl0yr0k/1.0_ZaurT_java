package Arifmetick;

import java.util.Scanner;

public class Work {

    public static void main(String[] args) {
        ArifmetickOperation.remainderStat(10.20,3.15);

        System.out.println("\nВычисления будут выполняться через объект");
        ArifmetickOperation st1 = new ArifmetickOperation();
        st1.division();
        System.out.println("________________________________");
        System.out.println( "Умножение переменных(статика)" + ArifmetickOperation.multiplication(4,4,8));
        System.out.println("Всего операций выполнено(статика):"+ArifmetickOperation.count);

        System.out.println("_______________________________");
        System.out.println("Введи радиус круга, чтобы узнать площадь");
        double radius = new Scanner(System.in).nextDouble();
        st1.countSquare(radius);
        ArifmetickOperation.countCircle(radius);
        st1.counAllParam(radius);
    }
}
