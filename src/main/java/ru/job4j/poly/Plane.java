package ru.job4j.poly;

public class Plane implements Vehicle {
    public void move() {
        System.out.println(getClass().getSimpleName() + " летит в воздухе");
    }
}
