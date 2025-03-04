package Arifmetick;

import java.math.BigDecimal;
import java.util.Scanner;

public class ArifmetickOperation {

    ArifmetickOperation () {
        System.out.println("Введи первое число:");
        numberOfScannerOne = new Scanner(System.in).nextInt();
        System.out.println("Введи второе число:");
        numberOfScannerTwo = new Scanner(System.in).nextInt();
    }
        private double numberOfScannerOne ;
        private double numberOfScannerTwo;
        static  int count;


    static BigDecimal multiplication(double firs, double second, double third ) {
        BigDecimal resultBig = new BigDecimal(firs * second * third);
        count ++;
        return  resultBig;
    }
    static BigDecimal multiplication(double firs, double second) {
        return multiplication(firs,second, 1);
    }


    static void DevisionStat (double first, double second) {
        double result = first % second;
        System.out.printf("Остаток от деления:" + result);
        count++;
    }

   public void Devision ( ) {

        DevisionStat(numberOfScannerOne, numberOfScannerTwo);
        double resDev = numberOfScannerOne / numberOfScannerTwo;
        BigDecimal mult = multiplication(numberOfScannerOne, numberOfScannerTwo);
        System.out.println("\nЦелое частное от деления :" + (int) resDev+ "\n" + "Результат умножения :" + mult);
        count++;
    }



}
