package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            while (countSeconds > 0){
                try {

                    System.out.print(countSeconds + " ");
                    Thread.sleep(1000);
                    countSeconds--;
                    if (countSeconds == 0) System.out.println("Марш!");
                } catch (InterruptedException e) {
                    System.out.println("Прервано!");
                    break;
                }
            }

            //add your code here - добавь код тут
        }
    }
}
