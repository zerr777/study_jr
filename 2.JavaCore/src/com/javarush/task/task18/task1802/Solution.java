package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        int min = 999;
        int tmp;
        while (file.available() > 0){
            min = (tmp = file.read()) < min ? tmp : min;
        }
        System.out.println(min);
        reader.close();
        file.close();
    }
}
