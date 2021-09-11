package com.study.kotlin.whoiam.date;

import java.util.Calendar;

public class Date {

    private Calendar calendar = Calendar.getInstance();
    private int year = calendar.get(Calendar.YEAR);
    private int month = calendar.get(Calendar.MONTH) +1;
    private int day = calendar.get(Calendar.DAY_OF_MONTH);


    public Date(int year, int month, int day) { setDate(year, month, day); }

    public void setDate(int year , int month, int day){

        this.year = year;
        this.month = checkMonth(month);
        this.day = checkDay(day);
        this.calendar.set(year,month,day);
    }

    private int checkMonth(int month) {
        if (month > 0 && month < 13) {
            return month;
        } else{
            return 1;
        }
    }

    private int checkDay(int day) {
        if (day > 0 && day < 32) {
            return day;
        } else{
            return 1;
        }
    }
}
