package com.teachmeskills.lesson_18.task_3.car;

public class Car {

    private static int nextId = 0;
    private int identificationNumber;

    public Car() {
        identificationNumber = ++nextId;
    }

    @Override
    public String toString() {
        return "Car №: " + identificationNumber;
    }

}
