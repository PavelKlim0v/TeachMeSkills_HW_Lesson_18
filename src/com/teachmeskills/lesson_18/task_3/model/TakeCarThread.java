package com.teachmeskills.lesson_18.task_3.model;

public class TakeCarThread implements Runnable {

    // СТО, из которого будут забираться машины. пока он не определен и будет задан через конструктор
    private ServiceStation service;

    public TakeCarThread(ServiceStation service){
        this.service=service;
    }

    // тут будет забирание 5ти машин из СТО
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            // забрать машину
            service.takeCar();
        }
    }

}
