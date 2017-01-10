package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int[] bArray = new int[20];
        int[] s1Array = new int[10];
        int[] s2Array = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < bArray.length; i++)
            bArray[i] = Integer.parseInt(reader.readLine());


        for (int i = 0; i < bArray.length; i++)
        {
            if (i < 10)
                s1Array[i] = bArray[i];
            else
                s2Array[i-10] = bArray[i];
        }

        for (int i = 0; i < s2Array.length; i++)
            System.out.println(s2Array[i]);


    }
}
