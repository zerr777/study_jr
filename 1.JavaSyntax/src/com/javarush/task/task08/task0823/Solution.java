package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] ch = s.toCharArray();
        ch[0] = Character.toUpperCase(s.charAt(0));
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ' ')
                ch[i + 1] = Character.toUpperCase(s.charAt(i + 1));
        }
        System.out.println(ch);
        //напишите тут ваш код
    }
}
