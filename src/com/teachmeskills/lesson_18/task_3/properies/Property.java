package com.teachmeskills.lesson_18.task_3.properies;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {

    private int maxCars;

    public Property() { }

    public int getMaxCars() {
        return maxCars;
    }

    public void getProperties() {
        Properties appProps = new Properties();

        try(FileInputStream fis = new FileInputStream("C:\\Users\\admin\\IdeaProjects\\TeachMeSkills_HW_Lesson_18\\" +
                "src\\com\\teachmeskills\\lesson_18\\task_3\\resources\\app.properties")) {
            appProps.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.maxCars = Integer.parseInt(appProps.getProperty("maxCars"));
    }

}
