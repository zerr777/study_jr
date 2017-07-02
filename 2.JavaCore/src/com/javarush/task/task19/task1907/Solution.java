package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(reader.readLine());
        String s = "";
        int count = 0;
        while (fr.ready()){
            s = s + (char)fr.read();
        }
        String[] arr = s.split( "\\W");
        for(String t: arr) {
            if(t.equals("world")) count++;
        }
        fr.close();
        reader.close();
        System.out.println(count);
    }
}
