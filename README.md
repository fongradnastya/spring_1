# Практическая работа №2. Spring, внедрение зависимостей.

Вторая практическая работа по дисциплине — Разработка корпоративных информационных систем.

## Цель работы

Ознакомиться с механизмом внедрения зависимостей в Spring.

## Задачи

- Необходимо создать приложение, в котором будут объявлены Spring-конфигурации при помощи xml-конструкций;
- В каждом варианте есть сущность (класс), необходимо создать интерфейс (самостоятельно на усмотрение студента) и
  классы, его имплементирующие;
- Объекты классов, имплементирующих данный интерфейс, будут передаваться в качестве зависимостей;
- Выполнить связывание и получить объекты из контекста. Продемонстрировать результаты в простейшем консольном
  приложении.

### Необходимо

1. Реализовать внедрение простых значений через конструктор;
2. Реализовать внедрение зависимости по ссылке через конструктор;
3. Интерфейс должен содержать как минимум один метод;
4. Классы, имплементирующие интерфейс, должны содержать как минимум одно поле (у разных классов - разные);
5. Зависимый класс должен содержать метод, который на основе вызова метода у зависимости выводил бы некоторое сообщение
   в консоль (Например для класса Автомобиля, в который внедряются Двигатели. Они могут выдавать свою мощность, а
   автомобиль может выводить сообщение, с какой скоростью он может двигаться);
6. Реализовать внедрение простых значений из внешнего файла через setter.

## Вариант №10
Холодильнк.

## Инструкция по сборке и запуску Java-проекта из командной строки

### 1. Установите JDK:

Убедитесь, что на вашем компьютере
установлен [ Maven — фреймворк для автоматизации сборки проектов](https://maven.apache.org/). Вы можете проверить это,
выполнив в командной строке следующую команду:

```
mvn -version
```
Maven можно установить автоматически, используя команду:
```
./mvnw clean install
```
### 2. Компиляция и запуск:

Теперь вы можете скомпилировать и запустить ваш проект. Откройте командную строку и перейдите в директорию вашего
проекта, например:

```
mvn package
```
После успешной компиляции, вы можете запустить ваше приложение с помощью команды:
```
java -jar target/java2-0.0.1-SNAPSHOT.jar
```
