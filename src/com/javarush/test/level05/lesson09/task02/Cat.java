package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

import com.javarush.test.level05.lesson05.task04.Solution;

public class Cat
{
    //напишите тут ваш код
    private String name;
    private int weight;
    private int age;
    private String color;
    private String adress;

    //- Имя
    public Cat (String name)
    {
        this.name = name;
        this.weight = 5;
        this.age = 1;
        this.color = null;
        this.adress = null;


    }

    //- Имя, вес, возраст
    public Cat (String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = null;
        this.adress = null;
    }
    //- Имя, возраст (вес стандартный)
    public Cat (String name, int age)
    {
        this.name = name;
        this.weight = 5;
        this.age = age;
        this.color = null;
        this.adress = null;
    }

    //- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
    public Cat (int weight, String color)
    {
        this.weight = weight;
        this.color = color;
        this.age = 1;
        this.name = null;
        this.adress = null;

    }

    //- вес, цвет, адрес ( чужой домашний кот)
    public Cat (int weight, String color, String adress)
    {
        this.weight = weight;
        this.color = color;
        this.age = 1;
        this.name = null;
        this.adress = adress;

    }


}
