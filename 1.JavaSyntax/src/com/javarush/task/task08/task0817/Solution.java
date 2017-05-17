package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Fam" + i, "Name" + i);
        }
        //напишите тут ваш код
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String,String> temp = new HashMap<>(map);
        for (String tmp :temp.values()) {
            int count = 0;
            for (String val : map.values()){
                if (tmp.equals(val))
                    count++;
        }
        if (count > 1)
            removeItemFromMapByValue(map, tmp);
        }


        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
