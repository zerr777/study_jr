package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        int max = 0;
        int tmp;
        while (file.available() > 0){
            max = (tmp = file.read()) > max ? tmp : max;
        }
        System.out.println(max);
        reader.close();
        file.close();
    }
}
