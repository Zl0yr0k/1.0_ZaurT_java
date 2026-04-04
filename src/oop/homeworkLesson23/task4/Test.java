package oop.homeworkLesson23.task4;

class X {}
class Y extends X {}

public class Test {
    public static void abc(X x, Y y) {
        System.out.println("privet");
    }
    public static void abc(Y y, X x) {
        System.out.println("poka");
    }

    static void main() {
        Y a = new Y();
        abc((X) a, a);
    }
}
