package org.example;

public enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String day;

    DaysOfWeek(String day) {
        this.day = day;
    }

    public void isWeekDay() {

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("It is a week day.");
                break;

            case "Saturday":
            case "Sunday":
                System.out.println("It is weekend.");
                break;

            default:
                System.out.println("No match!");
                break;
        }


    }
}
