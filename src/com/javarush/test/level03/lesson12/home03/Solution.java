package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/
import java.io.*;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //System.out.println("Введите часовую ставку!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String rate = reader.readLine();
        //String sAge = reader.readLine();
        int iRate = Integer.parseInt(rate);
        System.out.println("Я буду зарабатывать $" + iRate + " в час");
        //напишите тут ваш код


    }
}