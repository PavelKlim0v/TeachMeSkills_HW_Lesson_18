package com.teachmeskills.lesson_18.task_2.runner;

import com.teachmeskills.lesson_18.task_2.morningthread.MyThread;
import com.teachmeskills.lesson_18.task_2.properies.Property;

/**
 *  Задание 2. (Основное задание)
 * 	  Cоздать программу, имитирующую утро: чтение новостей, завтрак, кофе.
 * 	  Каждому потоку задать имя и приоритет из конфиг файла. Пусть имя и приоритет потока задается через файл пропертис.
 * 	  Пусть будет 3 потока, создать их и запустить.
 */

public class MainTask_2 {

    public static void main(String[] args) {
        Property property = new Property();

        property.setProperties("1");
        MyThread thread1 = new MyThread(property.getNameThread(), property.getPriority());
        System.out.println(thread1);

        property.setProperties("2");
        MyThread thread2 = new MyThread(property.getNameThread(), property.getPriority());
        System.out.println(thread2);

        property.setProperties("3");
        MyThread thread3 = new MyThread(property.getNameThread(), property.getPriority());
        System.out.println(thread3);

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
