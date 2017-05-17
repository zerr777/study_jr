package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String > map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Surname" + i, "Name" + i);
        }
        return map;
        //напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> m : map.entrySet()){
            if (m.getValue().equals(name))
                count++;
        }
        //напишите тут ваш код
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> m :map.entrySet()){
            if (m.getKey().equals(lastName))
                count++;
        }
        return count;
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
