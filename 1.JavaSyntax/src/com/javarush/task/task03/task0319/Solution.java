package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String name;
        int salary, years;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        name = reader.readLine();
        salary = Integer.parseInt(reader.readLine());
        years = Integer.parseInt(reader.readLine());
        System.out.println(name + " получает " + salary + " через " + years + " лет.");
        //напишите тут ваш код
    }
}
