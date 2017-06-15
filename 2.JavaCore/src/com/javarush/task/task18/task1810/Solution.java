package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream file = new FileInputStream(name);
        while (file.available() >= 1000){
            file.close();
            name = reader.readLine();
            file = new FileInputStream(name);
        }
        file.close();
        reader.close();
        throw new DownloadException();


    }

    public static class DownloadException extends Exception {

    }
}
