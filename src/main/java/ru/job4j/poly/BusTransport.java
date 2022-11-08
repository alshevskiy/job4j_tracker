package ru.job4j.poly;

public class BusTransport implements Transport {
    private final double PRICE = 51.5;

    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Количество пассажиров: " + number);
    }

    @Override
    public double refuel(int fuel) {
        return PRICE * fuel;
    }
}
