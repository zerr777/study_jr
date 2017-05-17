package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Vas", "Mas");
        map.put("Vas1", "Mas2");
        map.put("Vas", "Mas3");
        map.put("Vas2", "Mas2");
        map.put("Vas3", "Mas4");
        map.put("Vas4", "Mas5");
        map.put("Vas5", "Mas4");
        map.put("Vas6", "Mas6");
        map.put("Vas4", "Mas7");
        map.put("Vas7", "Mas9");
        //напишите тут ваш код

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
