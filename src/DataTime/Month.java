package DataTime;

import java.util.Calendar;

public class Month {
    private int month;
    private int days;

    private void getMonthCalendar () {
        Calendar calendar = Calendar.getInstance();
        month = calendar.get(Calendar.MONTH);
        days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
    private void countDaysOfManth () {
        for (int i =1; i <= days;i++ ) {
            System.out.println(i);
        }
    }

    public void  getDaysOfCurrentMonth () {
       getMonthCalendar();
        switch (month) {
            case 0 -> {
                System.out.println("January");
                countDaysOfManth();
                break;
            }
            case 1 -> {
                System.out.println("February");
                break;
            }
            case 2 -> {
                System.out.println("March");
                break;
            }
            case 3 -> {
                System.out.println("April");
                break;
            }
            case 4 -> {
                System.out.println("May");
                break;
            }
            case 5 -> {
                System.out.println("Jun");
                break;
            }
            case 6 -> {
                System.out.println("July");
                countDaysOfManth();
                break;
            }
            case 7 -> {
                System.out.println("August");
                break;
            }
            case 8 -> {
                System.out.println("September");
                break;
            }
            case 9 -> {
                System.out.println("October");
                break;
            }
            case 10 -> {
                System.out.println("November");
                break;
            }
            case 11 -> {
                System.out.println("December");
                break;
            }
            default -> {
                System.out.println("Тут что-то не то введено");
            }
        }
    }
}
