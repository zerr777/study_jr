package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "мама", "мыла", "раму");
        for (int i = 1; i < 6 ; i += 2) {
            list.add(i, "именно");
        }
        for (String ls : list)
            System.out.println(ls);
        //напишите тут ваш код
    }
}
