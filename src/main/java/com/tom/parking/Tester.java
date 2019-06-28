package com.tom.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        Date date= new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf=
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s= "2019/06/28 14:00:00";
        try {
            Date other= sdf.parse(s);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar= Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,9);
        calendar.add(Calendar.DAY_OF_YEAR,4);
        System.out.println(calendar.getTime());
    }
}
