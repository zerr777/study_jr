package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.SortedMap;


/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        HashMap<Character, Integer> out = new HashMap<>();
        for (int i = 0; i < alphabet.size(); i++) {
            int count = 0;
            for (String s : list) {
                char[] temp = s.toLowerCase().toCharArray();
                for (int j = 0; j < temp.length; j++) {
                    if (alphabet.get(i).equals(temp[j]))
                        count++;
                }
            }
            out.put(alphabet.get(i), count);
        }

        for (Character c : alphabet)
            System.out.println(c + " " + out.get(c));
        // напишите тут ваш код
    }

}
