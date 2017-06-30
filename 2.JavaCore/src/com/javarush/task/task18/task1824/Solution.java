package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    static String name;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                name = reader.readLine();
                FileInputStream file = new FileInputStream(name);
                file.close();
            }
        }
            catch (FileNotFoundException e){
                System.out.println(name);
                reader.close();

        }
    }
}
