package com.example.firstproject;

/**
 * Класс пользователя холодильником
 */
public class User {
    /**
     * Объект для контроля температуры
     */
    private final TemperatureControl controller;

    /**
     * Создаёт пользователя холодильником
     * @param controller контроллер температуры
     */
    public User(TemperatureControl controller){
        this.controller = controller;
    }

    /**
     * Настраивает процесс заморозки
     */
    public void freeze(){
        controller.turnOn();
        controller.setTemperature(-12);
        controller.setTemperature(-8);
        controller.getTemperature();
        controller.turnOff();
    }
}
