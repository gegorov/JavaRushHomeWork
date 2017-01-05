package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[3];
        for (int i = 0; i < 3; i++)
            a[i] = Integer.parseInt(reader.readLine());

        int min = 0, max = 0, med = 0;

        for(int i = 0; i < a.length; i++)
        {
            if (a[i] > a[max])
                max = i;

        }
        for(int i = 0; i < a.length; i++)
        {
            if (a[i] < a[min])
                min = i;

        }

        for (int i = 0; i <a.length; i++)
        {
            if (i != max && i != min)
                System.out.println(a[i]);
        }

    }
}
