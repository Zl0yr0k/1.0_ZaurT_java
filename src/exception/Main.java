package exception;

public class Main {
    static void main() {
        Tiger tiger1 = new Tiger();
        tiger1.canEat("meat");
        //tiger1.canEat("soup");

        try {
            tiger1.canDrink("voda");
            try {
                tiger1.canDrink("beer");
            } catch (NeVodaException e) {
                System.out.println("This is not water " + e.getMessage());
            } catch (Exception e) {
                System.out.println("This is inner catch  block " + e.getMessage());
            } finally {
                System.out.println("This is inner finally block ");
            }

        } catch (RuntimeException e) {
            System.out.println(" This is outer catch block runtime exceprion " + e.getMessage());
        } catch (Exception e) {
            System.out.println("This is outer catch block exception " + e.getMessage());
        }
    }
}
