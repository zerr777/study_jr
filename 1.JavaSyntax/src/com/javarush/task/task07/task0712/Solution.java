package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int min = 99999, max = 0;
        int minInd = 0, maxInd  = 0;
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
            if (list.get(i).length() > max){
                max = list.get(i).length();
                maxInd = i;
            }
            else if (list.get(i).length() < min){
                min = list.get(i).length();
                minInd = i;
            }
        }
        for (String ls : list){
            if (ls.length() == list.get(maxInd).length()){
                System.out.println(ls);
                break;
            }
            else if (ls.length() == list.get(minInd).length()){
                System.out.println(ls);
                break;
            }

        }

        //напишите тут ваш код
    }
}
