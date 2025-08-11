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

        OUTER: for (int i = 1 ; i <=hours; i++) {
            MIDDLE: for (int j = 1 ;j <= 59; j ++ ) {
                if (i > 1 && j % 10 == 0) {
                    System.out.println( "pip");
                }
                INNER: for (int n =1 ;n <= 59; n ++) {
                    System.out.println( i + ":" + j + ":" + n );
                    if (n * i >= j) continue MIDDLE;
                    if (i == hours && j == minutes && n == seconds) {break OUTER;}

                }

            }
        }
    }
}
