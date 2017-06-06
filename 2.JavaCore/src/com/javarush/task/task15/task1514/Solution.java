package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }

    static {
        labels.put(3.5, "S");
        labels.put(4.5, "S1");
        labels.put(5.5, "S2");
        labels.put(6.5, "S3");
        labels.put(7.5, "S4");
    }
}
