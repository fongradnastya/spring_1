package com.example.firstproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Главный класс программы
 */
public class Main {
    /**
     * Точка входа в программу
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // Создаем контекст приложения, загружая конфигурацию из файла applicationContext.xml
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Получаем бин (компонент) с именем "controller" из контекста
       User controller = (User) context.getBean("refrigeratorController");

        // Вызываем метод startComputer() у объекта user
        controller.freeze();
    }
}
