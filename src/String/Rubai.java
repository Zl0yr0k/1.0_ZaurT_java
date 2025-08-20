package String;

public class Rubai {
    String r1 = "Чтоб мудро жизнь прожить, знать надобно не мало Два важных правила запомни для начала:Ты"+
            " лучше голодай, чем что попало есть,И лучше будь один, чем вместе с кем попало";
    String r2 = r1.toUpperCase();
    char c1;
    char c2;


     void toPrint () {
        for (int i = 0; i < r1.length(); i++ ) {
            c1 = r1.charAt(i);
            c2 = r2.charAt(i);
            if (c1 != ',' && c1 != ':' && c1 != ' ' &&  c1==c2 ) {
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
         System.out.println();
    }

}
