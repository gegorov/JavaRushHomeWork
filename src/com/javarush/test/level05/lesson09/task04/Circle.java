package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //напишите тут ваш код
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private String color;

    public Circle(int x, int y, int radius)
    {
        this.centerX = x;
        this.centerY = y;
        this.radius = radius;

    }

    public Circle(int x, int y, int radius, int w)
    {
        this.centerX = x;
        this.centerY = y;
        this.radius = radius;
        this.width = w;

    }

    public Circle(int x, int y, int radius, int w, String color)
    {
        this.centerX = x;
        this.centerY = y;
        this.radius = radius;
        this.width = w;
        this.color = color;

    }

}
