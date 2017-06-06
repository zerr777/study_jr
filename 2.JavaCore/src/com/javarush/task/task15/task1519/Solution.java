package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        while (!s.equals("exit")){
            try {
                if (s.contains("."))
                    print(Double.parseDouble(s));
                else if (Integer.parseInt(s) > 0 && Integer.parseInt(s) < 128)
                    print(Short.parseShort(s));
                else if (Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128)
                    print(Integer.parseInt(s));
            }
            catch (Exception e){
                print(s);
            }
            s = reader.readLine();

        }
        //напиште тут ваш код
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
