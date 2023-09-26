package com.example.firstproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Главный класс программы
 */
public class Main {
    public static void main(String[] args) {
        // Создаем контекст приложения, загружая конфигурацию из файла applicationContext.xml
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Получаем бин (компонент) с именем "controller" из контекста
       RefrigeratorController controller = (RefrigeratorController) context.getBean("refrigeratorController");

        // Вызываем метод startComputer() у объекта user
        controller.start();
    }
}
