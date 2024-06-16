public class OverloadedMethod {
    int overloadedSumm (){
        System.out.println("Тут будет дефолтное значение");
        int result = 0;
        return result;
    }
    int overloadedSumm (int a) {
        System.out.println("Здесь будет :" + a);
        return a;
    }
    int overloadedSumm (int a, int b) {
        int result = a + b;
        System.out.println("Здесь будет :" + result);
        return result;
    }
    int overloadedSumm (int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Здесь будет :" + result);
        return result;

    }
    int overloadedSumm (int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println("Здесь будет :" + result);
        return result;

    }
    int overloadedSumm (int a, int b, int c, int d, int e) {
        int result = a + b + c + d + e;
        System.out.println("Здесь будет :" + result);
        return result;

    }
}
