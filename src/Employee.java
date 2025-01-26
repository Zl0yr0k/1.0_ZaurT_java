public class Employee{
     Employee (int id1, String surname1, int age1, float salary1, String department1) {
        id = id1;
        surname = surname1;
        age =age1;
        salary = salary1;
        department = department1;
    }

    int id;
    String surname;
    int age;
    float salary;
    String department;


    float increaseSalary () {
        return  salary *= 2;
    }

    void  showSalary () {
        System.out.println("Зарплата сотрудника "+ surname+ " будет "+salary);
    }

}

class  EmployeeTest {
    public static void main(String[] args) {
        Employee Vasiliy = new Employee(23,"Petuhov", 32,56.4F,"IT");
        Employee Tatiana = new Employee(34,"Velikaya",20,100,"boss");
        Tatiana.showSalary();
        Tatiana.increaseSalary();
        Tatiana.showSalary();
        Vasiliy.showSalary();
        Vasiliy.increaseSalary();
        Vasiliy.showSalary();

    }

}