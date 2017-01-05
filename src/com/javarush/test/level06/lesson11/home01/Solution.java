package com.javarush.test.level06.lesson11.home01;

/* Класс Cat и статическая переменная catCount
В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat) статическая переменная
catCount увеличивается на 1. Создать 10 объектов Cat и вывести значение переменной catCount на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Cоздай тут 10 объектов Cat
        Cat cat1 = new Cat();
        Cat cat12 = new Cat();
        Cat cat13 = new Cat();
        Cat cat14 = new Cat();
        Cat cat15 = new Cat();
        Cat cat16 = new Cat();
        Cat cat17 = new Cat();
        Cat cat18 = new Cat();
        Cat cat19 = new Cat();
        Cat cat20 = new Cat();



        //Выведи тут на экран catCount
        System.out.println(Cat.catCount);
    }

    public static class Cat
    {
        //Cоздай тут статическую переменную
        public static int catCount;

        //Создай тут конструктор
        public Cat()
        {
            Cat.catCount++;
        }
    }

}
