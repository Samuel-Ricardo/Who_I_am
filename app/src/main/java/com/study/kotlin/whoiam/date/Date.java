package com.study.kotlin.whoiam.date;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Calendar;

public class Date {

    private Calendar calendar = Calendar.getInstance();
    private int year = calendar.get(Calendar.YEAR);
    private int month = calendar.get(Calendar.MONTH) +1;
    private int day = calendar.get(Calendar.DAY_OF_MONTH);


    public Date(int year, int month, int day) { setDate(year, month, day); }

    public Date(String date) {

        String[] dates = date.split("/");

        setDate(
                Integer.parseInt(dates[0]),
                Integer.parseInt(dates[1]),
                Integer.parseInt(dates[2])
        );
    }



    public void setDate(int year , int month, int day){

        this.year = year;
        this.month = checkMonth(month);
        this.day = checkDay(day);
        this.calendar.set(year,month,day);
    }


    @Contract(pure = true)
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


    public boolean isLeapYear() { if (year%4 == 0) { return year%100 != 0;} else {return year%400 == 0;}}

    public int dayOfYear() {
        return calendar.get(Calendar.DAY_OF_YEAR);
    }



    public String formatSimpleDate(){

        String date = ""+day;
        String month = ""+this.month;

        if(day < 10) date = "0"+day;
        if(this.month < 10) month = "0"+month;

        return date+"/"+month;
    }

    public String formatFullDate() { return formatSimpleDate()+"/"+year;}

    public boolean isEquals(@NotNull Date date){
        return  this.year == date.year
                    &&
                this.month == date.month
                    &&
                this.day == date.day;
    }

    @Override
    public String toString(){ return formatFullDate();}
}
