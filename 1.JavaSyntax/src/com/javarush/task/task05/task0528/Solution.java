package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat now = new SimpleDateFormat("dd MM yyyy");
        System.out.println(now.format(date));
        //напишите тут ваш код
    }
}
