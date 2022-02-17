package com.teachmeskills.lesson_18.task_1.mythread;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        String currentThreadName = Thread.currentThread().getName();

        for (int i = 1; i < 4; i++) {
            System.out.println(currentThreadName + " is running! " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(currentThreadName + " completed.\n");
    }

    public static void methodJoin(MyThread name) {
        try {
            name.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
