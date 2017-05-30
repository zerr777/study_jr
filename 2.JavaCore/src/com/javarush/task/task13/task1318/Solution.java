package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String out ="";
        FileInputStream fis = new FileInputStream(s);
        while (fis.available() > 0){
            out += (char)fis.read();
        }
        fis.close();
        reader.close();
        System.out.println(out);
        // напишите тут ваш код
    }
}