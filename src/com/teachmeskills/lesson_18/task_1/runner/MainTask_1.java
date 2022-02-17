package com.teachmeskills.lesson_18.task_1.runner;

import com.teachmeskills.lesson_18.task_1.mythread.MyThread;

/**
 *  Задание 1. (Основное задание)
 * 	  Создать три потока Т1, Т2 и Т3
 * 	  Реализовать выполнение потока в последовательности Т3 -> Т2 -> Т1
 * 	  (используя метод join)
 */

public class MainTask_1 {

    public static void main(String[] args) {
        MyThread T1 = new MyThread("T1");
        MyThread T2 = new MyThread("T2");
        MyThread T3 = new MyThread("T3");

        T3.start();
        MyThread.methodJoin(T3);

        T2.start();
        MyThread.methodJoin(T2);

        T1.start();
        MyThread.methodJoin(T1);
    }

}
