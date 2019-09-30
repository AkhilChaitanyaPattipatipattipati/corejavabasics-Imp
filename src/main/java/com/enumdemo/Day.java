package com.enumdemo;

import java.util.Arrays;

public enum Day // extends java.lang.Enum //public final class Day
{
    SUN ( 1, "sunday" ),//public static final Day sunday=new Day(1,"sunday");
    MON ( 2, "monday" ),//public static final Day monday=new Day(1,"monday");
    TUE ( 3, "TUESDAY" ),
    WED( 4, "WEDNESDAY" ),
    THU ( 5, "THURSDAY" ),
    FRI ( 6, "FRIDAY" ),
    SAT ( 7, "SATURDAY" );

    private final Integer i;
    private final String name;

    Day(Integer i, String name) {
        this.i=i;
        this.name=name;
    }
    public static String findDayByNumber(int k){
       return Arrays.asList (Day.values ()).stream ().filter ( d->d.getI ()==k ).findFirst ().get ().getName ();
    }
    public Integer getI() {
        return i;
    }

    public String getName() {
        return name;
    }
}
