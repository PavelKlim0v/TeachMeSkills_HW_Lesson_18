package com.teachmeskills.lesson_18.task_3.model;

public class AddCarThread implements Runnable {

    // СТО, в который будут находится машины. пока он не определен и будет задан через конструктор
    private ServiceStation service;

    public AddCarThread(ServiceStation service){
        this.service=service;
    }

    // тут будет добавление 5ти машин с СТО
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            // добавить машину на СТО
            service.addCar();
        }
    }

}
