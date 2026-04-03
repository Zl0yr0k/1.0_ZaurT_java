package oop.homeworkLesson23.task1.p2;

import oop.homeworkLesson23.task1.p1.X;

public class Y extends X {
    Y () {
        super();
    }
    static String str = "Y class";
    @Override
    public void abs () {
        System.out.println(str);
    }

    static void main() {
        Y y = new Y();
        y.abs();
        y.abs(5);
    }
}
