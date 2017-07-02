package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1_str = reader.readLine();
        String file2_str = reader.readLine();
        String file3_str = reader.readLine();
        FileOutputStream file1 = new FileOutputStream(file1_str);
        FileInputStream file2 = new FileInputStream(file2_str);
        FileInputStream file3 = new FileInputStream(file3_str);
        byte[] tmp = new byte[file2.available()];
        byte[] tmp1 = new byte[file3.available()];
        file2.read(tmp);
        file3.read(tmp1);
        file1.write(tmp);
        file1.write(tmp1);
        file1.close();
        file2.close();
        file3.close();
        reader.close();

    }
}
