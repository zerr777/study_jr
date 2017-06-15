package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String url = s.substring(s.indexOf("?") + 1);
        String[] urlLst = url.split("&");
        for (String ls : urlLst) {
            if (ls.contains("="))
            System.out.print(ls.substring(0, ls.indexOf("=")) + " ");
            else System.out.print(ls + " ");
        }
        System.out.println();
        for(String ls : urlLst){
            if (ls.contains("obj")){
                try {
                alert(Double.parseDouble(ls.substring(ls.indexOf("=") + 1)));}
                catch (NumberFormatException e){
                    alert(ls.substring(ls.indexOf("=") + 1));
                }
            }
        }
        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
