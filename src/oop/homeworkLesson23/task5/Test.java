package oop.homeworkLesson23.task5;

public class Test {
    static void main() {
        X x = new Y();
        System.out.println(x.s1 + " " + ((Y)x).bool ); // x.bool I don't have enough possibilities to call that method

    }
}
class X {
    String s1 = "privet";
}
class Y extends X {
    boolean bool = false;
}