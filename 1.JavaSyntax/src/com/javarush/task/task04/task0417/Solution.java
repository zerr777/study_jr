package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(reader.readLine());
        int i2 = Integer.parseInt(reader.readLine());
        int i3 = Integer.parseInt(reader.readLine());
        if (i1 == i2 && i1 == i3)
            System.out.println(i1 + " " + i2 + " " + i3);
        else if (i1 == i2)
            System.out.println(i1 + " " +i2);
        else if (i1 == i3)
            System.out.println(i1 + " " + i3);
        else  if (i2 == i3)
            System.out.println(i2 + " " + i3);
    }
}