package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<Integer> inputList = new ArrayList<>();
        ArrayList<Integer> divByTwo = new ArrayList<>();
        ArrayList<Integer> divByThree = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++){
            inputList.add(Integer.parseInt(reader.readLine()));
        }


        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i) % 2 == 0 && inputList.get(i) % 3 == 0) {

                divByTwo.add(inputList.get(i));
                divByThree.add(inputList.get(i));

            } else if (inputList.get(i) % 3 == 0) {

                divByThree.add(inputList.get(i));

            } else if (inputList.get(i) % 2 == 0){

                divByTwo.add(inputList.get(i));

            } else {

                other.add(inputList.get(i));

            }
        }

        printList(divByThree);
        printList(divByTwo);
        printList(other);

    }

    public static void printList(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

    }

            //напишите тут ваш код

}
