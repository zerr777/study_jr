package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1, file2, file3;
        file1 = reader.readLine();
        file2 = reader.readLine();
        file3 = reader.readLine();
        FileInputStream f1 = new FileInputStream(file1);
        FileOutputStream f2 = new FileOutputStream(file2);
        FileOutputStream f3 = new FileOutputStream(file3);
        ArrayList<Byte> list = new ArrayList<>();

        while (f1.available() > 0)
            list.add((byte)f1.read());

        if (list.size() % 2 == 0){
            for (int i = 0; i < list.size() / 2; i++) {
                f2.write(list.get(i));
            }
            for (int i = list.size() / 2; i < list.size(); i++) {
                f3.write(list.get(i));
            }
        }
        else {
            for (int i = 0; i < (list.size() / 2) + 1 ; i++) {
                f2.write(list.get(i));
            }
            for (int i = (list.size() / 2) + 1; i < list.size(); i++) {
                f3.write(list.get(i));
            }
        }
        reader.close();
        f1.close();
        f2.close();
        f3.close();

    }
}
