package Import_Static.p1.p2.p3.p4;

import Arifmetick.ArifmetickOperation;

public class F {


        public ArifmetickOperation getArifmetOperation2 () {
            ArifmetickOperation ArifmetOperation2 = new ArifmetickOperation(4, 2);
            return ArifmetOperation2;
        }

        //Тут без импортирования с полным путем и статики и инстанса
        Arifmetick.Arifmetic Arifmet2 = new Arifmetick.Arifmetic();
        int X = Arifmet2.number23;
        int Y = Arifmetick.Arifmetic.number24;

}
