package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int sum = 0;
        while (true){
            s = reader.readLine();
            if (s.equals("сумма"))
                break;
            else
                sum += Integer.parseInt(s);
        }
        System.out.println(sum);
        //напишите тут ваш код
    }
}
