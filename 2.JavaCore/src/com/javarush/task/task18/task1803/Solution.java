package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        while (file.available() > 0) {
            int d = file.read();
            if(hashMap.containsKey(d)) {
                hashMap.put(d,hashMap.get(d) + 1);
            } else hashMap.put(d, 1);
        }

        int max = 0;
        for(Map.Entry entry: hashMap.entrySet()) {
            if ((int) entry.getValue() > max) max = (int) entry.getValue();
        }

        for (Map.Entry entry: hashMap.entrySet()) {
            if(entry.getValue().equals(max)) System.out.print(entry.getKey() + " ");
        }
        reader.close();
        file.close();
    }
}
