package com.example.firstproject;

/**
 * Класс холодильника
 */
public class Refrigerator implements TemperatureControl{

    /**
     * Включён ли холодильник
     */
    private boolean isOn;

    /**
     * Текущая температура холодильника
     */
    private double temperature;

    /**
     * Минимально возможная температура холодильника
     */
    private double minTemperature;

    private double maxTemperature;

    /**
     * Ширина холодилника
     */
    private double width;

    /**
     * Глубина холодильнтика
     */
    private double depth;

    /**
     * Высота холодильника
     */
    private double height;

    /**
     * Тип компрессора
     */
    private String compressorType;

    /**
     * Конструктор холодильника
     * @param minTemperature
     */
    public Refrigerator(double maxTemperature, double minTemperature){
        this.isOn = false;
        if (maxTemperature < minTemperature){
            throw new IllegalArgumentException("Минимальное значение температуры не может быть выше максимального");
        }
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.temperature = 0;
    }

    /**
     * Запускает работу холодильника
     */
    public void turnOn() {
        this.isOn = true;
        System.out.println("Холодильник включен.");
    }

    /**
     * Выключает холодильник
     */
    public void turnOff() {
        this.isOn = false;
        System.out.println("Холодильник выключен.");
    }

    /**
     * Устанавливает температуру внутри холодильника
     * @param temperature температура в градусах цельсия
     */
    public void setTemperature(int temperature) {
        if (isOn) {
            if(temperature < minTemperature || temperature > maxTemperature){
                this.temperature = maxTemperature;
                System.out.println("Температура должна находиться в диапазоне между " + minTemperature +
                        " и " + maxTemperature + " градусов.");
            }
            else{
                this.temperature = temperature;
                System.out.println("Температура установлена на " + temperature + " градусов.");
            }
        } else {
            System.out.println("Холодильник выключен. Невозможно установить температуру.");
        }
    }

    /**
     * Измеряет температуру внутри холодильника
     * @return температура в градусах цельсия
     */
    public double getTemperature() {
        if (isOn) {
            System.out.println("Текущая температура " + this.temperature + " градусов.");
            return this.temperature;
        } else {
            System.out.println("Холодильник выключен. Невозможно получить температуру.");
            return 0;
        }
    }

    /**
     * Получает ширину холодильника
     * @return ширина в см
     */
    public double getWidth() {
        return width;
    }

    /**
     * Устанавливает ширину холодильника
     * @param width ширина в см
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Получает глубину холодильника
     * @return глубина в см
     */
    public double getDepth() {
        return depth;
    }

    /**
     * Задаёт глубину холодильника
     * @param depth
     */
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
