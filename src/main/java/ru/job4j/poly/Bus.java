package ru.job4j.poly;

public class Bus implements Vehicle {
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по скоростным трассам");
    }
}
