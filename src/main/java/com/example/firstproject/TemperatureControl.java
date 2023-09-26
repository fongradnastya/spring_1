package com.example.firstproject;

public interface TemperatureControl {
    void turnOn();
    void turnOff();
    void setTemperature(int temperature);
    double getTemperature();
}