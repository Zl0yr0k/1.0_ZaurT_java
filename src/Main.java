import EmployeePublickDefault.Employee;

public class Main {
    public static void main(String[] args) {
        int a = 11;
        int b = 3;
        long c = 100L;

        int d = 20;
        int e = 100;

        int j = (int) c;

        int ostatok = a % b;
        int celayaChast = a / b;
        System.out.println(celayaChast);
        System.out.println(ostatok);
        System.out.println(j);


        boolean u = a < b & d++ == e;   //проверка использования логическикого оператора & и &&

        System.out.println(u);
        System.out.println(d);

        Employee testPublickPrivateDefault1 = new Employee(34,"Busya", "home");
        Employee men = new Employee(45,"klever","work");
        System.out.println("___________________________________________________");
        men.getSalary();
        men.setSalary(67);
        men.getSalary();
        men.getId();
        men.getSurname();
        System.out.println(men.surname);





    }
}