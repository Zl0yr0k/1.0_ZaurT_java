package String;

final class Email {
     void email (String email) {
    String mail = email;
    String machStrat = "@";
    String machEnd = ";";
    int machStartText;
    int machEndText;

    OUTER: for (int i = 0; i < mail.length(); i++) {
        String ch_i = String.valueOf(mail.charAt(i));

        if (ch_i.equals(machStrat)) {
           machStartText = i;

            INNER: for (int  j = i; j < mail.length(); j++ ) {
                String ch_j = String.valueOf(mail.charAt(j));
                if (ch_j.equals(machEnd)) {
                    machEndText = j;
                    System.out.println(mail.substring(i + 1,j));
                    continue OUTER;
                    
                }

            }
        }



    }
    }


    public void toString(String email) {
        System.out.println(email);
    }
}
