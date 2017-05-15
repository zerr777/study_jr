package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int left, top, width, height;
    public void initialize(int left, int top, int width, int height){
        this.height = height;
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public void initialize(int left, int top){
        this.height = 0;
        this.left = left;
        this.top = top;
        this.width = 0;
    }
    public void initialize(int left, int top, int width){
        this.height = height;
        this.left = left;
        this.top = top;
        this.width = height;
    }
    public void initialize(Rectangle rectangle){
        this.width = rectangle.width;
        this.height = rectangle.height;
        this.top = rectangle.top;
        this.left = rectangle.top;
    }

    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
