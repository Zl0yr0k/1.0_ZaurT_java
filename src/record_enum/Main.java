package record_enum;

public class Main {
    static void main() {
        Object o1 = (true) ? new Integer(10) : new Double("20.0");

        System.out.println(o1);
    }
}
