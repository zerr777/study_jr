package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader(args[0]);
        ArrayList<Character> buf = new ArrayList<>();
        int count = 0;
        while (file.ready())
        {
            buf.add((char) file.read());
        }
        for (Character b : buf){
            if (b == ' ')
                count++;
        }
        System.out.format("%.2f", (double)count / buf.size() * 100);
        file.close();
    }
}
