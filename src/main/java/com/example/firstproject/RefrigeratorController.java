package com.example.firstproject;

public class RefrigeratorController {

    private final TemperatureControl controller;

    public RefrigeratorController(TemperatureControl controller){
        this.controller = controller;
    }
    public void start(){
        controller.turnOn();
        controller.setTemperature(-12);
        controller.setTemperature(-8);
        controller.getTemperature();
        controller.turnOff();
    }
}
