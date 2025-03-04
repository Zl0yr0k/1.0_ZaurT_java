package Arifmetick;

public class Work {

    public static void main(String[] args) {
        ArifmetickOperation.DevisionStat(10.20,3.15);

        System.out.println("\nВычисления будут выполняться через объект");
        ArifmetickOperation st1 = new ArifmetickOperation();
        st1.Devision();
        System.out.println("________________________________");
        System.out.println( "Умножение переменных(статика)" + ArifmetickOperation.multiplication(4,4,8));
        System.out.println("Всего операций выполнено(статика):"+ArifmetickOperation.count);
    }
}
