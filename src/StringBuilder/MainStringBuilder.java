package StringBuilder;

public class MainStringBuilder {

    public static void main(String ... args) {
        StringBuilder sb1 = new StringBuilder("Тут что то написано для замены");
        StringBuilder sb2 = new StringBuilder("Тут что то написано для замены!!!sdasdasd");
        System.out.println(ravenstvo(sb1, sb2.delete(sb1.length(), sb2.length())));

    }

    static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean resalt = false;
        if (sb1.length() == sb2.length()) {
            resalt = true;
        }
        for (int i = 0; i < sb1.length(); i++) {
            if (sb1.charAt(i) != sb2.charAt(i)) {
                resalt = false;
                break;
            }
        }
        return resalt;
    }


}
