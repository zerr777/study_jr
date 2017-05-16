package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int min = 999999999;
        int ind = 0;
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
            if (list.get(i).length() < min) {
                min = list.get(i).length();
                ind = i;
            }
        }
        for (String ls : list)
            if (ls.length() == list.get(ind).length())
                System.out.println(ls);
        //напишите тут ваш код
    }
}
