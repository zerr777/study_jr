package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(reader.readLine());
        int i2 = Integer.parseInt(reader.readLine());
        int i3 = Integer.parseInt(reader.readLine());
        int max = Math.max(i1, Math.max(i2, i3));
        int min = Math.min(i1, Math.min(i2, i3));
        int avarege = i1 + i2 + i3 - min - max;
        System.out.println(avarege);


        //напишите тут ваш код
    }
}
