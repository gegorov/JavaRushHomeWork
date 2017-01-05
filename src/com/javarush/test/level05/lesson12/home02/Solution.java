package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man gena = new Man("Gena", 31, "Minsk");
        Man motia = new Man("Motia", 5, "Minsk");

        Woman masha = new Woman("Maria", 33, "Minsk");
        Woman mama = new Woman("Galina", 67, "Minsk");

        //выведи их на экран тут
        System.out.println(gena.toString());
        System.out.println(motia.toString());
        System.out.println(masha.toString());
        System.out.println(mama.toString());

    }

    //добавьте тут ваши классы

    public static class Man
    {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString()
        {
            return this.name + " " + this.age + " " + this.address;
        }



    }

    public static class Woman
    {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString()
        {
            return this.name + " " + this.age + " " + this.address;
        }

    }
}
