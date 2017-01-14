package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        String imenno = "именно";

        ArrayList<String> myList = new ArrayList<>();

        myList.add("мама");
        myList.add("мыла");
        myList.add("раму");



        for (int i = 0; i < myList.size(); i++) {

            myList.add(i + 1, imenno);
            i++;

        }


        for (int i = 0; i < myList.size(); i++) {

            System.out.println(myList.get(i));
        }


    }
}
