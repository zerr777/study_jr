package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int result = 0;
        for (int i = 0; i < 3; i++) {
            result += number %10;
            number = number / 10;
        }
        return result;
        //напишите тут ваш код
    }
}