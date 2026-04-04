package oop.homeworkLesson23.task3;

public class X {
    public X () {
        System.out.println("X");
    }
    public X (int i) {
        System.out.println("X" + i);
    }
    private boolean abc () {
        return false;
    }

    static void main() {
        X x = new Y (18);
        System.out.println( x.abc());
    }
}
     class Y extends X{
 public Y (int i) {
     System.out.println("Y");
 }
 public boolean abc () {return true;}
}