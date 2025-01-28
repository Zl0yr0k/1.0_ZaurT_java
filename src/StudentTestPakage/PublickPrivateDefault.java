package StudentTestPakage;

import EmployeePublickDefault.Employee;

public class PublickPrivateDefault {
    public static void main(String[] args) {
        Employee  busya = new Employee(45,"Busya 67","work");
        busya.getId();
        busya.setSalary(89);
        busya.getSalary();
        busya.getSurname();
        System.out.println(busya.surname);

    }



}
