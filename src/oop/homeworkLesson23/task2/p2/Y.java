package oop.homeworkLesson23.task2.p2;

import oop.homeworkLesson23.task2.p1.X;

public class Y extends X {
public void abc () {
    System.out.println("Y");
}
public void def() {
    Y y = new Y();
    y.abc();
}
public void ghi() {
    X x = new Y();
    //x.abc();
}

    static void main(String[] args ) {
        Y a = new Y();
        a.abc();
        a.def();
        a.ghi();
    }

}
