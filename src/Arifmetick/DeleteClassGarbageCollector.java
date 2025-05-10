package Arifmetick;

public class DeleteClassGarbageCollector {
    public static void twiceMethod () {
        String a1 = new String("Этот объект в этом методе будут существовать пока этот метод исполняется в main");
        String a2 = new String("Если не передать результат выполнения в переменную, объект будет потерян");
    }

    public static void main(String[] args) {
        ArifmetickOperation arifmetOper = new ArifmetickOperation();
        arifmetOper = new ArifmetickOperation();
        arifmetOper = null;
        twiceMethod();


    }
}
