package com.javarush.test.level06.lesson08.task01;

/* Класс Cat и статическая переменная catCount
Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.
*/

import com.javarush.test.level05.lesson05.task04.Solution;

public class Cat
{
    //напишите тут ваш код
    public static int catCount;

    public Cat()
    {
        Cat.catCount++;
    }

}
