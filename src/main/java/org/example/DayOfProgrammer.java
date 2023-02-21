package org.example;

import java.util.Calendar;

public class DayOfProgrammer {
    public static void main(String[] args) {
        String date = dayOfProgrammer(1918);
        System.out.println(date);
    }

    public static String dayOfProgrammer(int year) {
        StringBuilder date = new StringBuilder();
        if (year < 1918) {
            if (year % 4 == 0) {
                date.append("12.09.").append(year);
            } else {
                date.append("13.09.").append(year);
            }
        }else if(year == 1918){
            date.append("26.09.").append(year);
        } else {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                date.append("12.09.").append(year);
            } else {
                date.append("13.09.").append(year);
            }
        }

        return date.toString();
    }
}