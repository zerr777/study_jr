package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner file = new Scanner(new FileInputStream(reader.readLine()));
        ArrayList<Integer> result = new ArrayList<>();
        while (file.hasNext()) {
            int x = file.nextInt();
            if (x % 2 == 0)
                result.add(x);
        }
        Collections.sort(result);
        reader.close();
        file.close();
        result.forEach((c) -> System.out.println(c));

        // напишите тут ваш код
    }
}
