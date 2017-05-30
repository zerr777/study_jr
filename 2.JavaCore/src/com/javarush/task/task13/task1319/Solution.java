package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
        String s = reader.readLine();
        while (!s.equals("exit")){
            writer.write(s);
            writer.newLine();
            s = reader.readLine();
        }
        writer.write(s);
        reader.close();
        writer.close();
        // напишите тут ваш код
    }
}
