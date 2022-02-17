package com.teachmeskills.lesson_18.task_3.model;

import com.teachmeskills.lesson_18.task_3.car.Car;
import com.teachmeskills.lesson_18.task_3.runner.MainTask_3;
import java.util.ArrayList;
import java.util.List;

public class ServiceStation {

    // нумерация машины на СТО
    private int numberCar = 0;

    // список нумерации машин (списываются и записываются по мере их поступления)
    private List<Car> numCarList = new ArrayList<>();

    // максимальное кол-во машин которое может одновременно находится в СТО (прописано в пропертис)
    private int maxCars = MainTask_3.property.getMaxCars();

    // Забирание машины из СТО
    public synchronized void takeCar() {
        while (numberCar < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Забрали 1 машину, на СТО машина: " + numCarList.get(numberCar - 1));
        numCarList.remove(numberCar - 1);
        numberCar--;

        notify();
    }

    // Добавление машины на СТО
    public synchronized void addCar() {
        // максимальное кол-во машин которое может одновременно находится в СТО (прописано в пропертис)
        while (numberCar >= maxCars) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        numCarList.add(new Car());
        System.out.println("Добавилась 1 машина, на СТО машина: " + numCarList.get(numberCar));
        if (numberCar != maxCars) {
            numberCar++;
        }

        notify();
    }

}
