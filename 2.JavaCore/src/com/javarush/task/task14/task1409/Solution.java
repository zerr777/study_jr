package com.javarush.task.task14.task1409;

/* 
Мосты
*/

import com.javarush.task.task14.task1409.Bridge;
import com.javarush.task.task14.task1409.SuspensionBridge;
import com.javarush.task.task14.task1409.WaterBridge;

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge bridge){
        System.out.println(bridge.getCarsCount());

    }
    //add println method here
}

