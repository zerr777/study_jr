package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("sfsf");
        list.add("sfsfsfsf");
        list.add("sfsfsfsfsfsf");
        list.add("sfsfsfsfsfsfsfsf");
        list.add("sfsfsfsfsfsfsfsfsfsf");
        System.out.println(list.size());
        for (String ls :list){
            System.out.println(ls);
        }
        //напишите тут ваш код
    }
}
