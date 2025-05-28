package StudentTestPakage;

import CarPackage.Car;

public class Student {

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
    Car car;




    Student() {
    }

    Student(int numberOfStudentTick2, String name2, String surname2, int yearOfLearn2, String course2, float money2, float averageOfMathematics2, float averageOfEconomic2, float averageOfForeign2) {
        numberOfStudentTick = numberOfStudentTick2;
        name = name2;
        surname = surname2;
        yearOfLearn = yearOfLearn2;
        course = course2;
        money = money2;
        averageOfMathematics = averageOfMathematics2;
        averageOfEconomic = averageOfEconomic2;
        averageOfForeign = averageOfForeign2;
    }

    Student(int numberOfStudentTick3, String name3, String surname3, String course3) {
        this(numberOfStudentTick3, name3, surname3, 0, course3, 0.0F, 0, 0, 0);
    }

    float averageSummStudent(float averageOfMathematics, float averageOfEconomic, float averageOfForeign) {
        return averageSumm = ((averageOfEconomic + averageOfForeign + averageOfMathematics) / 3);
    }

    void showInfo() {
        System.out.println("Средний балл у студена " + name + " " + surname + " " + averageSummStudent(averageOfMathematics, averageOfEconomic, averageOfForeign));
    }
}



