package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;
import java.util.Date;
import java.util.Random;

public class Main {
    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static Random rnd = new Random();
    static String randomString(int len){
                StringBuilder sb = new StringBuilder( len );
                for( int i = 0; i < len; i++ ) 
                sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
                return sb.toString();
            }

    public static void main(String[] args) {
        /*
         * Проинициализирован массив strings
         *
         * Массив проинициализирован таким образом,
         * что он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = new String[20];
            
            for (int i = 0; i < strings.length; i++) {
            strings[i] = randomString(20);
            }
            
            
            
	    /*
	     * Проинициализирован массив persons
	     *
	     * 1. Создан класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализирован массив persons 20
	     *    экземплярыми созданного класса.
	     */
            Person person1 = new PersonClass("Петр Петров", new Date(75, 1, 23));
            Person person2 = new PersonClass("Петр Петров", new Date(73, 4, 31));
            Person person3 = new PersonClass("Семен Петров", new Date(65, 11, 30));
            Person person4 = new PersonClass("Григорий Петров", new Date(45, 10, 14));
            Person person5 = new PersonClass("Евгений Петров", new Date(78, 7, 10));
            Person person6 = new PersonClass("Аркадий Петров", new Date(84, 11, 9));
            Person person7 = new PersonClass("Антон Петров", new Date(86, 11, 8));
            Person person8 = new PersonClass("Максим Петров", new Date(82, 6, 18));
            Person person9 = new PersonClass("Петр Иванов", new Date(91, 3, 23));
            Person person10 = new PersonClass("Иван Иванов", new Date(68, 6, 22));
            Person person11 = new PersonClass("Семен Иванов", new Date(93, 8, 28));
            Person person12 = new PersonClass("Григорий Иванов", new Date(84, 0, 29));
            Person person13 = new PersonClass("Евгений Иванов", new Date(89, 5, 13));
            Person person14 = new PersonClass("Аркадий Иванов", new Date(77, 4, 17));
            Person person15 = new PersonClass("Антон Петров", new Date(65, 3, 16));
            Person person16 = new PersonClass("Максим Петров", new Date(62, 8, 22));
            Person person17 = new PersonClass("Петр Сидоров", new Date(96, 4, 14));
            Person person18 = new PersonClass("Иван Сидоров", new Date(98, 9, 13));
            Person person19 = new PersonClass("Иван Сидоров", new Date(93, 10, 27));
            Person person20 = new PersonClass("Семен Сидоров", new Date(91, 1, 22));
            Person[] persons = new Person[]{person1, person2, person3, person4, person5, person6, person7, person8, person9, person10, person11, person12, person13, person14, person15, person16, person17, person18, person19, person20}; 
                        

        /*
         * Проинициализирована переменную sort
         *
         * 1. Создан класс, реализующий интерфейс Sort
         *
         * 2. Проинициализирована переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new SortClass();
       

        /*
         * Проинициализирована переменная comparator
         *
         * 1. Создан класс, реализующий интерфейс Comparator.
         *    
         *
         * 2. Проинициализирована переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = new StringComparator();
        Comparator comparator2 = new StringComparatorReverce();
        
        /*
         * Отсортирован массив persons по возрастанию
         *
         *  массив отсортирован по возрастанию.
         *  на данный момент если имя совпадает сортировка происходит по дате рождения, но сортируется по возрастанию даты, а не возраста, 
         *  это можно изменить в классе PersonAgeComparator поменяв возвращаемые значения на противоположные
         */
        sort.sort(persons);
        

        /*
         * Отсортирован массив strings по возрастанию
         *
         */
        
        sort.sort(strings);
        

        /*
         * Отсортирован массив strings по убыванию
         * используется comparator из класса StringComparatorReverce
         */
        sort.sort(strings, comparator2);
        
    }
}
