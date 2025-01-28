package EmployeePublickDefault;

public class EmployeeTest {

        public static void main(String[] args) {
            Employee Vasiliy = new Employee(23,"Petuhov", 32,"IT");
            Employee Tatiana = new Employee(34,"Velikaya",20,"boss");
            Tatiana.showSalary();
            Tatiana.increaseSalary();
            Tatiana.showSalary();
            System.out.println(Tatiana.id);
            Vasiliy.showSalary();
            Vasiliy.increaseSalary();
            Vasiliy.showSalary();

        }
}
