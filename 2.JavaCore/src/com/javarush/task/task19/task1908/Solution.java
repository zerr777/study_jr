package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fw = new BufferedWriter(new FileWriter(reader.readLine()));
        String s = "";
        while (fr.ready()){
            s = s + (char)fr.read();
        }
        String[] arr = s.split( " ");
        for(String t: arr) {
            try {
                int temp = Integer.parseInt(t);
                fw.write(temp + " ");
            }
            catch (NumberFormatException e){

            }
        }
        fr.close();
        fw.close();
        reader.close();
    }
}
