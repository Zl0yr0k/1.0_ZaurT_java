package String;

public class StringMonth {
   private static final String [] MONTH = new String[] {"", "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"};

   public static String getMonth (int month) {
       String numberToStringMonth = (month < 1 || month > 12) ? MONTH[0] : MONTH[month];
       return numberToStringMonth;
   }
}
