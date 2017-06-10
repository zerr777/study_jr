package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<Byte> set = new TreeSet<>();
        FileInputStream file = new FileInputStream(reader.readLine());
        while (file.available() > 0){
            set.add((byte)file.read());
        }
        set.forEach( k -> System.out.print(k + " "));
        reader.close();
        file.close();
    }
}
