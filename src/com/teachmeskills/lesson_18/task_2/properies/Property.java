package com.teachmeskills.lesson_18.task_2.properies;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {

    private String nameThread;
    private int priority;

    public Property() { }

    public Property(String nameThread, int priority) {
        this.nameThread = nameThread;
        this.priority = priority;
    }

    public String getNameThread() {
        return nameThread;
    }

    public int getPriority() {
        return priority;
    }

    public void setProperties(String value) {
        Properties appProps = new Properties();

        try(FileInputStream fis = new FileInputStream("C:\\Users\\admin\\IdeaProjects\\TeachMeSkills_HW_Lesson_18\\" +
                "src\\com\\teachmeskills\\lesson_18\\task_2\\resources\\app.properties")) {
            appProps.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.nameThread = appProps.getProperty("nameT" + value);
        this.priority = Integer.parseInt(appProps.getProperty("priorityT" + value));
    }

}
