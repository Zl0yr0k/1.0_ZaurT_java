package Arifmetick;

public class TestOutputs1 {
    int a = 1;
    static int b = 2;

    void abc (int a) {
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        TestOutputs1 to1 = new TestOutputs1();
        to1.abc(3);
    }
}
