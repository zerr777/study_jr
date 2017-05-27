package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
            int id;
            String input;

            while (true){
                input = reader.readLine();
                if (input.isEmpty())
                    break;
                else {
                    id = Integer.parseInt(input);
                    input = reader.readLine();
                    map.put(input, id);
                }
            }
        map.forEach((k, v) -> System.out.println(v + " " + k));
       // System.out.println("Id=" + id + " Name=" + name);
    }
}
