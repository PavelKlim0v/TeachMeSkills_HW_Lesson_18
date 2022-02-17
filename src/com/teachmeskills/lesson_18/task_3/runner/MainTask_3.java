package com.teachmeskills.lesson_18.task_3.runner;

import com.teachmeskills.lesson_18.task_3.model.AddCarThread;
import com.teachmeskills.lesson_18.task_3.model.ServiceStation;
import com.teachmeskills.lesson_18.task_3.model.TakeCarThread;
import com.teachmeskills.lesson_18.task_3.properies.Property;

/**
 *  Задание 3. (Дополнительное задание)
 * 	  Есть СТО. На сто может быть в обслуживании максимум определенное количество машин.
 * 	  Создать класс, который будет запускаться в отдельном потоке и будет добавлять машины на обслуживание в СТО.
 * 	  Создать класс, который будет запускаться в отдельном потоке и будет забирать исправленные машины из СТО.
 * 	  Пусть максимальное количество доступных для обслуживания машин задается через файл пропертис.
 * 	  Использовать synchronized, wait, notify.
 */

public class MainTask_3 {

    public static Property property = new Property();

    public static void main(String[] args) {
        // создаем объект СТО
        ServiceStation service = new ServiceStation();
        AddCarThread addCarThread = new AddCarThread(service);
        TakeCarThread takeCarThread = new TakeCarThread(service);

        // максимальное количество доступных для обслуживания машин задается через файл пропертис
        property.getProperties();

        new Thread(addCarThread).start();   // добавляем машины на обслуживание в СТО
        new Thread(takeCarThread).start();  // забираем исправленные машины из СТО
    }

}
