package com.javarush.task.task14.task1408;

/**
 * Created by Zerr on 29.05.2017.
 */
public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 3;
    }

    @Override
    public String getDescription() {
        return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.",super.getDescription(),Country.BELARUS,getCountOfEggsPerMonth());
    }
}
