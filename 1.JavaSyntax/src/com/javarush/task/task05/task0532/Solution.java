package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = -999;
        int n = Integer.parseInt(reader.readLine());
        if (n > 0)
            for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(reader.readLine());
            maximum = maximum < temp ? temp : maximum;
            }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
