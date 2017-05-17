package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Name" + i, 20 * i * 10);
        }
        return map;
        //напишите тут ваш код
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = (Map.Entry) iterator.next();
            if (pair.getValue() < 500)
                iterator.remove();
        }
        //напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}