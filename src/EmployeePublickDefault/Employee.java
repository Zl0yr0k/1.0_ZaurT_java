package EmployeePublickDefault;

public class Employee{

    int id;
    public String surname;
    int age;
    private float salary;
    String department;

     private Employee (int id1, String surname1, int age1, float salary1, String department1) {
        id = id1;
        surname = surname1;
        age =age1;
        salary = salary1;
        department = department1;
    }

    Employee (int id1, String surname1, int age1, String department1) {
        this (id1,surname1,age1,0.0F,department1);
    }

    public Employee (int id1, String surname1, String department1) {
        this (id1,surname1,0,0.0F,department1);
    }


    float increaseSalary () {
        return  salary *= 2;
    }

    void  showSalary () {
        System.out.println("Зарплата сотрудника "+ surname+ " будет "+salary);
    }

    public void getId () {
        System.out.println(id);
    }
    public void getSurname () {
        System.out.println(surname);
    }
    public  void  getSalary () {
        System.out.println(salary);
    }
    public void setSalary (float salary) {
         this.salary = salary;
    }

    public static void main(String[] args) {
        Employee tat = new Employee(67,"surn", 45,67.90F,"Home");
        tat.getSalary();
    }
}



