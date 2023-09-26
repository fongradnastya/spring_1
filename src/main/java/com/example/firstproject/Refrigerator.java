package com.example.firstproject;

public class Refrigerator implements TemperatureControl{
    private boolean isOn;
    private double temperature;

    private double minTemperature;

    private double width;

    private double depth;

    private double height;

    private String compressorType;

    public Refrigerator(double minTemperature){
        this.isOn = false;
        this.minTemperature = minTemperature;
        this.temperature = 0;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println("Холодильник включен.");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("Холодильник выключен.");
    }

    public void setTemperature(int temperature) {
        if (isOn) {
            if(temperature < minTemperature){
                this.temperature = minTemperature;
                System.out.println("Невозможно установить температуру ниже " + minTemperature + " градусов.");
            }
            else{
                this.temperature = temperature;
                System.out.println("Температура установлена на " + temperature + " градусов.");
            }
        } else {
            System.out.println("Холодильник выключен. Невозможно установить температуру.");
        }
    }

    public double getTemperature() {
        if (isOn) {
            System.out.println("Текущая температура " + this.temperature + " градусов.");
            return this.temperature;
        } else {
            System.out.println("Холодильник выключен. Невозможно получить температуру.");
            return 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getCompressorType() {
        return compressorType;
    }

    public void setCompressorType(String compressorType) {
        this.compressorType = compressorType;
    }
}
