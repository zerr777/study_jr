package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
            ArrayList<String> temp = new ArrayList<>();
            for (String ls : list){
                if (ls.contains("р") && ls.contains("л"))
                    temp.add(ls);
                else if (ls.contains("л")){
                    temp.add(ls);
                    temp.add(ls);
                }
                else if (!ls.contains("р"))
                    temp.add(ls);

            }

        //напишите тут ваш код
        return temp;
    }
}