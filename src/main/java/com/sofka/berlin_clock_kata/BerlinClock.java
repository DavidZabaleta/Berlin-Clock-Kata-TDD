package com.sofka.berlin_clock_kata;

public class BerlinClock {
    private static final char OFF_BLOCK = 'O';
    private static final char YELLOW_BLOCK = 'Y';
    private static final char RED_BLOCK = 'R';

    public String singleMinutesRow(String time) {
        int singleMinute  = Integer.parseInt(time.replace(":", "").substring(3,4));

        switch (singleMinute){
            case 1:
            case 6:
                return "YOOO";
            case 2:
            case 7:
                return "YYOO";
            case 3:
            case 8:
                return "YYYO";
            case 4:
            case 9:
                return "YYYY";
            default:
                return "OOOO";
        }
    }

    public String fiveMinutesRow(String time) {
        int minutes  = Integer.parseInt(time.replace(":", "").substring(2,4));
        int fiveMinutesBlock = minutes / 5;
        StringBuilder result = new StringBuilder("OOOOOOOOOOO");

        for (int i = 1; i <= fiveMinutesBlock; i++) {
            if (i % 3 == 0) {
                result.setCharAt(i - 1, RED_BLOCK);
            } else {
                result.setCharAt(i - 1, YELLOW_BLOCK);
            }
        }
        return result.toString();
    }

    public String singleHoursRow(String time) {
        int singleHours  = Integer.parseInt(time.replace(":", "").substring(1,2));
        StringBuilder result = new StringBuilder("OOOO");

        for (int i = 0; i < singleHours % 5; i++) result.setCharAt(i, RED_BLOCK);

        return result.toString();
    }

    public String fiveHoursRow(String time) {
        int hours  = Integer.parseInt(time.replace(":", "").substring(0,2));
        int hourBlock = hours / 5;
        StringBuilder result = new StringBuilder("OOOO");

        for (int i = 0; i < hourBlock; i++) {
            result.setCharAt(i, RED_BLOCK);
        }

        return result.toString();
    }

    public String secondsLamp(String time) {
        int seconds  = Integer.parseInt(time.replace(":", "").substring(4,6));
        return (seconds % 2 == 0) ? String.valueOf(YELLOW_BLOCK) : String.valueOf(OFF_BLOCK);
    }
}
