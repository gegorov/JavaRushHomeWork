package com.javarush.test.level05.lesson12.home05;
import java.io.*;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        boolean trigger = true;
        //напишите тут ваш ко-1д
        while(trigger)
        {

            String temp = reader.readLine();

            if (temp.equals("сумма"))
                trigger = false;
            else
                sum = sum + Integer.parseInt(temp);

        }

        System.out.println(sum);
    }
}
