package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        boolean isOdd = false;
        Date data = new Date(date);
        Date newYearDate = new Date(data.getYear(), 0, 1);
        long delay =  (data.getTime() - newYearDate.getTime())/(24*60*60*1000);
        if(delay % 2 == 0) isOdd = true;
        return isOdd;
    }
}
