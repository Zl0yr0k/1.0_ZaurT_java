package Cikle_For_Wile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите нижний предел: " );
        int lowLimit = new Scanner(System.in).nextInt();
        System.out.print("Введите верхний предел: " );


        int topLimit = new Scanner(System.in).nextInt();
        System.out.print("Введите шаг: " );
        int step = new Scanner(System.in).nextInt();


        if (lowLimit < topLimit && step > 0) {
            for (int i = lowLimit; i <= topLimit; i += step) {
                System.out.println(i);
            }
        } else if(step > 0) {
            for (int i = lowLimit; i >= topLimit; i -= step) {
                System.out.println(i);
            }
        } else {
            System.out.println("Шаг равен нулю или oтридцательный");
        }


        CikleFor1.countTime();
        CikleWile1.countTimeWithWile();
    }
}
