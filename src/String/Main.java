package String;

public class Main {
    public static void main(String[] args) {
        StringHelloWorld sh = new StringHelloWorld();
        System.out.println(sh.s3);

        Rubai r1 = new Rubai();
        r1.toPrint();

        Email e1 = new Email();
        String email = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";
        System.out.println("___________________________________");
        e1.toString(email);
        System.out.println("___________________________________");
        e1.email(email);
        e1.toString(email);
    }


}