package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(reader.readLine());
        FileWriter fw = new FileWriter(reader.readLine());
        int count = 0;
        while (fr.ready()){
            int w = fr.read();
            if (count % 2 != 0){
                fw.write(w);
            }
            count++;
        }
        fr.close();
        fw.close();
        reader.close();
    }
}
