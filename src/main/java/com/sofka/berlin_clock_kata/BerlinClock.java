package com.sofka.berlin_clock_kata;

public class BerlinClock {
    private static final char OFF_BLOCK = 'O';
    private static final char YELLOW_BLOCK = 'Y';
    private static final char RED_BLOCK = 'R';

    public String entireBerlinClock(String time) {
        return  secondsLamp(time) +
                fiveHoursRow(time) +
                singleHoursRow(time) +
                fiveMinutesRow(time) +
                singleMinutesRow(time);
    }

    public String secondsLamp(String time) {
        int seconds  = getSpecificTimeNoPunctuationInARange(time, 4, 6);

        return String.valueOf((seconds % 2 == 0) ? YELLOW_BLOCK : OFF_BLOCK);
    }

    public String fiveHoursRow(String time) {
        int hours  = getSpecificTimeNoPunctuationInARange(time, 0, 2);
        int hourBlock = hours / 5;

        return getResult(hourBlock, RED_BLOCK);
    }

    public String singleHoursRow(String time) {
        int singleHours  = getSpecificTimeNoPunctuationInARange(time, 1, 2);
        int singleHoursBlock = singleHours % 5;

        return getResult(singleHoursBlock, RED_BLOCK);
    }

    public String fiveMinutesRow(String time) {
        int minutes  = getSpecificTimeNoPunctuationInARange(time, 2 , 4);
        int fiveMinutesBlock = minutes / 5;
        StringBuilder result = new StringBuilder("OOOOOOOOOOO");

        for (int i = 1; i <= fiveMinutesBlock; i++) {
            result.setCharAt(i - 1, (i % 3 == 0) ?  RED_BLOCK : YELLOW_BLOCK);
        }
        return result.toString();
    }

    public String singleMinutesRow(String time) {
        int singleMinute  = getSpecificTimeNoPunctuationInARange(time, 3, 4);
        int singleMinuteBlock = singleMinute % 5;

        return getResult(singleMinuteBlock, YELLOW_BLOCK);
    }

    public int getSpecificTimeNoPunctuationInARange(String time, int fromStringPosition, int toStringPosition) {
        return Integer.parseInt(time.replace(":", "").substring(fromStringPosition, toStringPosition));
    }

    public String getResult(int condition, char colorLamp) {
        StringBuilder result = new StringBuilder("OOOO");;

        for (int i = 0; i < condition; i++) result.setCharAt(i, colorLamp);

        return result.toString();
    }
}
