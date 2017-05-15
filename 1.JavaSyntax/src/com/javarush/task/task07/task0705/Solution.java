package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] big = new int[20];
        int[] one = new int[10];
        int[] two = new int[10];
        for (int i = 0; i < 20; i++) {
            big[i] = Integer.parseInt(reader.readLine());
            if (i > 9)
                two[i - 10] = big[i];
            else one[i] = big[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(two[i]);
        }
        //напишите тут ваш код
    }
}
