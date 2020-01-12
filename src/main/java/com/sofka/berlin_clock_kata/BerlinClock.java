package com.sofka.berlin_clock_kata;

public class BerlinClock {

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
}
