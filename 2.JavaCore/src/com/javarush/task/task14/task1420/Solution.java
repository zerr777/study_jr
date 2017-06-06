package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b;
        int x = 0;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        if (a <= 0 || b <= 0) throw new Exception();
        for (int i = 1; i < ((a > b ) ? a : b); i++) {
            if (a % i ==0 && b % i == 0)
                x = i;
        }
        System.out.println(x);
    }
}
