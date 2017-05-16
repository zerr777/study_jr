package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> all = new ArrayList<>();
        ArrayList<Integer> third = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            all.add(Integer.parseInt(reader.readLine()));
            if (all.get(i) % 3 == 0)
                third.add(all.get(i));
            if (all.get(i) % 2 == 0)
                two.add(all.get(i));
            if (all.get(i) % 3 != 0 && all.get(i) % 2 != 0) other.add(all.get(i));
        }

        printList(third);
        printList(two);
        printList(other);
         //напишите тут ваш код
    }

    public static void printList(List<Integer> list) {
        for (Integer ls : list)
            System.out.println(ls);
        //напишите тут ваш код
    }
}
