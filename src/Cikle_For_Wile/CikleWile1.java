package Cikle_For_Wile;

import DataTime.Month;

public class CikleWile1 {
    static void countTimeWithWile () {
        int hours;
        int minutes;
        int seconds;

        Month time = new Month();
        hours = time.getHours();
        minutes = time.getMinutes();
        seconds = time.getSeconds();
        System.out.println("Текущее время " + hours + ":" + minutes + ":" + seconds);

        int i =0;
        OUTER: while (i < hours) {

            int j =-1;
            MIDDLE: do {
                j++;

                int n =0;
                INNER : while (n <=59) {

                    if (n * i >= j) {
                        System.out.println("pip");
                        continue MIDDLE ;
                    }
                    System.out.println( i + ":" + j + ":" + n );
                    if (i == hours && j == minutes && n == seconds) {break OUTER;}
                    n++;
                }

            } while (j <59);
            i++;
        }
    }
}
