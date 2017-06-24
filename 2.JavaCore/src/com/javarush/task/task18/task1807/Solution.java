package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileInputStream fis = new FileInputStream(file);
        int count = 0;

        while (fis.available() > 0){
            if (fis.read() == ',')
                count++;
        }


        System.out.println(count);
        fis.close();
        reader.close();
    }
}
