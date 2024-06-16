import java.util.Scanner;

class Student {
    Student () {}
    Student (int numberOfStudentTick2, String name2, String surname2, int yearOfLearn2,String course2, float money2, float averageOfMathematics2, float averageOfEconomic2, float averageOfForeign2){
        numberOfStudentTick = numberOfStudentTick2;
        name =name2;
        surname = surname2;
        yearOfLearn = yearOfLearn2;
        course =course2;
        money = money2;
        averageOfMathematics = averageOfMathematics2;
        averageOfEconomic = averageOfEconomic2;
        averageOfForeign = averageOfForeign2;

    }

    Student (int numberOfStudentTick3, String name3, String surname3, String course3) {
        this (numberOfStudentTick3, name3, surname3, 0,course3, 0.0F, 0,0,0);
    }
    int numberOfStudentTick;
    String name;
    String surname;
    int yearOfLearn;
    String course;
    float averageOfMathematics;
    float averageOfEconomic;
    float averageOfForeign;
    float averageSumm;
    float averageOut;
    float money;
    BankAccount bA;


    float averageSummStudent(float averageOfMathematics, float averageOfEconomic, float averageOfForeign) {
        return averageSumm = ((averageOfEconomic + averageOfForeign + averageOfMathematics) / 3);

    }

    void showInfo() {
        System.out.println("Средний балл у студена " + name + " " + surname + " " + averageSummStudent(averageOfMathematics, averageOfEconomic, averageOfForeign));
    }


}

class BankAccount {


    float startAccount() {
        float money = 0;
        System.out.println("ВВеди сумму на которую нужно пополнить аккаунт");
        return  money = new Scanner(System.in).nextInt();

    }

    float replenishmentAccount(float money) {
        System.out.println("ВВеди сумму на которую нужно увеличить аккаунт");
        float moneyadd = new Scanner(System.in).nextInt();
        return money += moneyadd;
    }

    float removeAccount(float money) {
        System.out.println("ВВеди сумму на которую нужно уменьшить аккаунт");
        float moneydel = new Scanner(System.in).nextInt();
        return  money -= moneydel;

    }

    void showInfo(float money) {
        System.out.println(money);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student Vasiliy = new Student();
        //BankAccount vasiliyBankAcciunt = new BankAccount();
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

    }


}
