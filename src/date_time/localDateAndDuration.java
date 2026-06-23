package date_time;

import java.time.Duration;
import java.time.LocalDateTime;

public class localDateAndDuration {
    static void main() {
        //из-за того, что конструктор private в LocalDateTime и др и методы static Объекты создаются через
        // форму статического обращения к методу
        LocalDateTime  ldt = LocalDateTime.of(2016,03,23,12,23);
        Duration d = Duration.ofHours(3);
        System.out.println(ldt.plus(d));
    }
}
