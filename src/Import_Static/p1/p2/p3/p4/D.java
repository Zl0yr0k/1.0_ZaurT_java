package Import_Static.p1.p2.p3.p4;


import Arifmetick.ArifmetickOperation;
import Import_Static.p1.A;
import Import_Static.p1.A.*;
import Import_Static.p1.p2.B;
import Import_Static.p1.p2.p3.C.*;
import Import_Static.p1.p2.p3.p4.p5.E.*;
import EmployeePublickDefault.*;
import java.lang.*;
import java.lang.System;
import static Import_Static.p1.p2.B.age;
import static Import_Static.p1.p2.B.*;

import static Import_Static.p1.A.test;
import static Import_Static.p1.A.testString;
import static Import_Static.p1.A.*;

public class D {
    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(text);
        B classB = new B();
        classB.result = 32;
        System.out.println(classB.result);

        A classA = new A();

        //Тут с импортированием. Указывается короткий путь
        ArifmetickOperation ArifmetOperation = new ArifmetickOperation(3, 2);
        System.out.println(ArifmetickOperation.resultNumber);

        //Тут без импортирования с полным путем
        Arifmetick.Arifmetic Arifmet = new Arifmetick.Arifmetic();
        Arifmet.number23 = 45;

        //Если нужно импортировать все классы пакета то импортируем весь пакет с классами
        Employee emp = new Employee(23, "Петя", "It");
        emp.getId();
        emp.surname = "Vasya";
        emp.getSurname();

        //Обращение к статической переменной без импорта с полным путем
        int number25 = Arifmetick.Arifmetic.number24;
        System.out.println(Arifmetick.Arifmetic.number24);

        F fclass = new F();
        System.out.println(fclass.getArifmetOperation2());

        J jclass = new J();
        System.out.println(jclass.getArifmetOperation2());

        System.out.println(test);
        testString();

    }
}

//тут проверка видимости import ов на одной странице класса и  в разных классах одного

class J {
    public ArifmetickOperation getArifmetOperation2() {
        ArifmetickOperation ArifmetOperation2 = new ArifmetickOperation(7, 6);
        return ArifmetOperation2;
    }

    //Тут без импортирования с полным путем и статики и инстанса
    Arifmetick.Arifmetic Arifmet2 = new Arifmetick.Arifmetic();
    int X = Arifmet2.number23;
    int Y = Arifmetick.Arifmetic.number24;
}
