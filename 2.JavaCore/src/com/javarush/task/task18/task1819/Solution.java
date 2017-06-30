package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1_str = reader.readLine();
        String file2_str = reader.readLine();
        FileOutputStream file1 = new FileOutputStream(file1_str);
        FileInputStream file2 = new FileInputStream(file2_str);
        FileInputStream file1_r = new FileInputStream(file1_str);
        byte[] tmp = new byte[file1_r.available()];
        byte[] tmp1 = new byte[file2.available()];
        file1_r.read(tmp);
        file2.read(tmp1);
        file1.write(tmp1);
        file1.write(tmp);

        file1.close();
        file2.close();
        file1_r.close();
        reader.close();

    }
}
