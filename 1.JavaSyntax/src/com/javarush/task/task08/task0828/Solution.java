package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> month = new ArrayList<>(Arrays.asList(new DateFormatSymbols(Locale.ENGLISH).getMonths()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String mon = reader.readLine();
        System.out.printf("%s is %s month", mon, month.indexOf(mon) + 1);
        //напишите тут ваш код
    }
}
