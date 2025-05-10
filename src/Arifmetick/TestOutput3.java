package Arifmetick;

public class TestOutput3 {
    int a =1;
    static  int b =2;
    void  abc (int a) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(this.a);
        System.out.println(TestOutput3.b);
    }

    public static void main(String[] args) {
        TestOutput3 to3 = new TestOutput3();
        to3.abc(4);
    }
}
