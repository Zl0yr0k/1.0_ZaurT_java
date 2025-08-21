package String;

public class Rubai {
    String r1 = "Чтоб мудро жизнь прожить, знать надобно не мало Два важных правила запомни для начала:Ты"+
            " лучше голодай, чем что попало есть,И лучше будь один, чем вместе с кем попало";
    String upper;
    String lower;



     void toPrint () {
        for (int i = 0; i < r1.length(); i++ ) {
            lower = String.valueOf(r1.charAt(i));
            upper = String.valueOf(r1.charAt(i)).toUpperCase();
            if (lower.equals(" ") || lower.equals(":") || lower.equals(",")) {
                System.out.print(lower);
                continue;
            } else if ( lower.equals(upper)) {
                System.out.println();
                System.out.print(lower);
                continue;
            }
            System.out.print(lower);
        }
         System.out.println();
    }

}
