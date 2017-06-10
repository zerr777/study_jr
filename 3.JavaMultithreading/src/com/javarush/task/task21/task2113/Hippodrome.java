package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Озеров on 09.06.2017.
 */
public class Hippodrome {

    public Horse getWinner() {
        int win = 0;
        for (int i = 1; i < horses.size(); i++) {
            win = horses.get(i).distance > horses.get(win).distance ? i : win;
        }
        return horses.get(win);
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName()+ "!");
    }

    public void run(){
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public void move(){
        for (Horse horse : horses)
            horse.move();
    }
    public void print(){
        for (Horse horse : horses)
            horse.print();
        for (int i = 0; i < 3; i++) {
            System.out.println();

        }
    }

    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args){
        Horse horse1 = new Horse("Horse1", 3, 0);
        Horse horse2 = new Horse("Horse2", 3, 0);
        Horse horse3 = new Horse("Horse3", 3, 0);

        game = new Hippodrome(Arrays.asList(horse1,horse2, horse3));
        game.run();
        game.printWinner();

    }
}
