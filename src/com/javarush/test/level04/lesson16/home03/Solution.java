package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        boolean trigger = true;
        //напишите тут ваш ко-1д
        while(trigger)
        {
            int temp = Integer.parseInt(reader.readLine());
            sum = sum + temp;
            if (temp == -1)
                trigger = false;

        }

        System.out.println(sum);
    }
}
