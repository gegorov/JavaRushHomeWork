package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        int number = 0;
        boolean trigger = true;


        //напишите тут ваш код

        // проверяем чтоб вводили целые числа
        while (trigger)
        {
            try
            {
                number = Integer.parseInt(reader.readLine());
                // проверяем чтоб это вводимое число было больше 0
                if (number > 0)
                    trigger = false;
                else
                    System.out.println("Введите число больше 0");

            }
            catch (NumberFormatException e)
            {
                System.out.println("Введите число больше 0");
            }

        }

        // собираем массив интеждеров с количеством элементов равных number


        int[] myArr = new int[number];

        for (int i = 0; i < number; i++)
        {
            myArr[i] = Integer.parseInt(reader.readLine());

        }



        //поиск максимума
        maximum = myArr[0];
        for (int i = 1; i < number; i++)
            maximum = max(myArr[i], maximum);




        System.out.println(maximum);
    }

    public static int max(int a, int b)
    {
        return a > b ? a : b;
    }
}
