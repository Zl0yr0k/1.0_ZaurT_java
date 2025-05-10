package Arifmetick;

public class TestOutputs2 {
    int a =1;
    static int b =2;

    static void abc (final int a) {
        System.out.println(a);
        System.out.println(TestOutputs2.b);
    }

    public static void main(String[] args) {
        abc(5);
    }
}
