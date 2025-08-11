package Cikle_For_Wile;

import java.util.Scanner;

public class CycleWhile {
    public static void main(String[] args) {

        int sum = 0;
        System.out.println("Введите число и нажмите ");

        while (true) {
            int valNumber = new Scanner(System.in).nextInt();
            if (valNumber == 0  ) {
                sum = 0;
            } else if ( valNumber == 12345) {
                break;
            }
            sum += valNumber;
            System.out.println("Сумма: " + sum );
            System.out.println("Введите еще одночисло или 0 для сброса суммы");

        }



    }
}
