package com.study.kotlin.whoiam.domain.model;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;

public class LiteDate {

    @NotNull
    public static LiteDate now(){

        Calendar calendar = Calendar.getInstance();

        return new LiteDate(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH) +1,
                calendar.get(Calendar.DAY_OF_MONTH)
        );
    }


    public static boolean isLeapYear(int year) {
        if (year%4 == 0) { return year%100 != 0;} else {return year%400 == 0;}
    }





    private Calendar calendar = Calendar.getInstance();
    private int year = calendar.get(Calendar.YEAR);
    private int month = calendar.get(Calendar.MONTH) +1;
    private int day = calendar.get(Calendar.DAY_OF_MONTH);


    public LiteDate(int year, int month, int day) { setDate(year, month, day); }

    public LiteDate(@NotNull String date) {

        String[] dates = date.split("/");

        setDate(
                Integer.parseInt(dates[2]),
                Integer.parseInt(dates[1]),
                Integer.parseInt(dates[0])
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

    public boolean isEquals(@NotNull LiteDate date){
        return  this.year == date.year
                    &&
                this.month == date.month
                    &&
                this.day == date.day;
    }

    @Override
    public String toString(){ return formatFullDate();}


    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
