package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();
        System.setOut(consoleStream);
        String s = outputStream.toString();
        String[] result = s.split(" ");
        if (result[1].equals("+")) {

                int temp = Integer.parseInt(result[0]) + Integer.parseInt(result[2]);
                s = result[0] + " + " + result[2] + " = " + temp;

        }
        if (result[1].equals("-")) {

            int temp = Integer.parseInt(result[0]) - Integer.parseInt(result[2]);
            s = result[0] + " - " + result[2] + " = " + temp;

        }
        if (result[1].equals("*")) {

            int temp = Integer.parseInt(result[0]) * Integer.parseInt(result[2]);
            s = result[0] + " * " + result[2] + " = " + temp;

        }
        System.out.println(s);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

