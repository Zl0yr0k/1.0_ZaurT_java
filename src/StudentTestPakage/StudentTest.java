package StudentTestPakage;


import CarPackage.Car;

public class StudentTest {
    public void  compareObjectStudent (Student onePersonParam, Student twoPersonParam) {
        if (onePersonParam.name.equals(twoPersonParam.name) && onePersonParam.surname == twoPersonParam.surname && onePersonParam.course == twoPersonParam.course){
            System.out.println("Эти объекты равны по содержанию");
        } else {
            System.out.println("Эти объекты не равны по содержанию");
        }
    }

    public void compareObjectStudentNestedIf (Student onePersonParam, Student twoPersonParam) {
        if (onePersonParam.name.equals(twoPersonParam.name) ) {
            System.out.println("Имена этих объектов совпадают");
            if (onePersonParam.surname == twoPersonParam.surname) {
                System.out.println("Фамилии этих объектов совпадают");
                if (onePersonParam.course == twoPersonParam.course){
                    System.out.println("Курсы этих объектов совпадают");
                }else {
                    System.out.println("Курсы этих объектов не совпадают");
                }
            }else {
                System.out.println("Фамилии этих объектов не совпадают");
            }
        }else {
            System.out.println("Имена этих объектов не совпадают");
        }

    }

    public static void main(String[] args) {
        Student Vasiliy = new Student();
        //BankAccount vasiliyBankAccount = new BankAccount();
        Vasiliy.bA = new BankAccount();
        Vasiliy.numberOfStudentTick = 10;
        Vasiliy.name = "Vasiliy";
        Vasiliy.surname = "Petuhov";
        Vasiliy.yearOfLearn = 1990;
        Vasiliy.averageOfMathematics = 2.23F;
        Vasiliy.averageOfEconomic = 1.45F;
        Vasiliy.averageOfForeign = 3.34F;
        //float averageVas = (Vasiliy.averageOfEconomic+ Vasiliy.averageOfForeign+ Vasiliy.averageOfMathematics)/3;
        //System.out.println("Средний балл у студена " + Vasiliy.name + " "+ Vasiliy.surname +" "+ averageVas);
        //System.out.println(Vasiliy.averageSummStudent(Vasiliy.averageOfMathematics, Vasiliy.averageOfEconomic, Vasiliy.averageOfForeign));
        Vasiliy.showInfo();

        //Vasiliy.money = vasiliyBankAcciunt.startAccount();
        Vasiliy.money = Vasiliy.bA.startAccount();
        Vasiliy.bA.showInfo(Vasiliy.money);


        //Vasiliy.money = vasiliyBankAcciunt.replenishmentAccount(Vasiliy.money);
        Vasiliy.money = Vasiliy.bA.replenishmentAccount(Vasiliy.money);


        //Vasiliy.money = vasiliyBankAcciunt.startAccount();
        Vasiliy.money = Vasiliy.bA.removeAccount(Vasiliy.money);
        Vasiliy.bA.showInfo(Vasiliy.money);

        //Vasiliy.money = vasiliyBankAcciunt.replenishmentAccount(Vasiliy.money);
        Vasiliy.money = Vasiliy.bA.replenishmentAccount(Vasiliy.money);
        System.out.println(Vasiliy.money);


        Student Tatiana = new Student();
        Tatiana.bA = new BankAccount();
        Tatiana.numberOfStudentTick = 10;
        Tatiana.name = "Tatiana";
        Tatiana.surname = "Omelchenko";
        Tatiana.yearOfLearn = 1987;
        Tatiana.averageOfMathematics = 5.67f;
        Tatiana.averageOfEconomic = 5.23F;
        Tatiana.averageOfForeign = 5.23F;
        //float averageTat = (Tatiana.averageOfEconomic+ Tatiana.averageOfForeign+ Tatiana.averageOfMathematics)/3;
        //System.out.println("Средний балл у "+ Tatiana.name+" "+ Tatiana.surname +" " + averageTat);
        Tatiana.showInfo();

        Tatiana.money = Tatiana.bA.startAccount();
        Tatiana.bA.showInfo(Tatiana.money);
        Tatiana.money = Tatiana.bA.replenishmentAccount(Tatiana.money);
        Tatiana.bA.showInfo(Tatiana.money);
        Tatiana.money = Tatiana.bA.removeAccount(Tatiana.money);
        Tatiana.bA.showInfo(Tatiana.money);

        Student Rodion = new Student();
        Rodion.numberOfStudentTick = 10;
        Rodion.name = "Rodion";
        Rodion.surname = "Kuzelbah";
        Rodion.yearOfLearn = 1990;
        Rodion.averageOfMathematics = 4.56F;
        Rodion.averageOfEconomic = 3.78F;
        Rodion.averageOfForeign = 4.90F;
        //float averageRo = (Rodion.averageOfEconomic+ Rodion.averageOfForeign+ Rodion.averageOfMathematics)/3;
        //System.out.println("Срединй бал у " +Rodion.name + " " + Rodion.surname + " "  + averageRo);
        Rodion.showInfo();

        Student Ivan= new Student(23, "Ivan ", "Stupakov", "Mehanik" );
        Ivan.averageOfMathematics = 2.23F;
        Ivan.averageOfEconomic = 1.45F;
        Ivan.averageOfForeign = 3.34F;
        Ivan.showInfo();

        Student Eva = new Student(35, "Eva", "Ost",4, "Психология", 500,5.5f, 3.5F, 4.7f  );
        Eva.showInfo();
        Eva.bA = new BankAccount();
        Eva.money = Eva.bA.startAccount();
        Eva.money = Eva.bA.replenishmentAccount(Eva.money);
        Eva.money = Eva.bA.removeAccount(Eva.money);
        Eva.bA.showInfo(Eva.money);
        System.out.println(Eva.money);

        Student Eva3 = new Student(35, "Eva", "Ost",4, "Психология", 500,5.5f, 3.5F, 4.7f  );

        Student Eva2 = new Student(35,"Eva","Ost","Психология");
//        Eva2.car = new Car("red", "v4", 4);
//        System.out.println("Машина у Евы вот такая");
//        System.out.println(Eva2.car.toString());


        System.out.println("Проверим обекты на совпадение");
        StudentTest compare = new StudentTest();
        compare.compareObjectStudent(Eva,Eva2);
        compare.compareObjectStudent(Eva, Tatiana);
        System.out.println("Проверим объекты насовпадение с помощю nested if");
        compare.compareObjectStudentNestedIf(Eva, Eva2);
        compare.compareObjectStudentNestedIf(Eva, Tatiana);

        if (Eva.equals(Eva)) {
            System.out.println("Эти Евы совпадают");
        } else {System.out.println("Эти Евы  не совпадают");}

        if (Eva.equals(Tatiana)) {
            System.out.println("Эти объекты совпадают");
        } else {System.out.println("Эти объекты не совпадают");}


    }


}
