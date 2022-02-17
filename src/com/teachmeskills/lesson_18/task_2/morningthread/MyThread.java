package com.teachmeskills.lesson_18.task_2.morningthread;

public class MyThread extends Thread {

    public MyThread() { }

    public MyThread(String nameThread, int priority) {
        setName(nameThread);
        setPriority(priority);
    }

    @Override
    public void run(){
        for (int i = 1; i < 4; i++) {
            System.out.println(getName() + " " + i);
        }
        System.out.println("Поток: " + getName() + " завершен.");
    }

}
