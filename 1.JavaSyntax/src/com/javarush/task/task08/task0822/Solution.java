package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int minimum = array.get(0);
        for (Integer ls : array)
            if (ls < minimum)
                minimum = ls;
        // find minimum here — найти минимум тут
        return minimum;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        //create and initialize a list here - создать и заполнить список тут
        return list;
    }
}
