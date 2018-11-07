package com.dimonandpumba.diary.javafx.Solutions;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar =  new GregorianCalendar();
        int today = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
        int month = gregorianCalendar.get(Calendar.MONTH);
        gregorianCalendar.set(Calendar.DAY_OF_MONTH,1);
        int weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = Calendar.MONDAY; i < weekday; i++) {
            System.out.println("    ");
        }
        do {
            int day = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);
            System.out.println((day==today) ? "*" : " ");
            if(gregorianCalendar.get(gregorianCalendar.DAY_OF_WEEK)==1) System.out.println();
            gregorianCalendar.add(Calendar.DAY_OF_MONTH,1);
        }while (gregorianCalendar.get(Calendar.MONTH)==month);


    }
}
