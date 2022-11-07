package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        boolean engine = true;
    }

    @Override
    public void passengers(int value) {
        boolean all = true;
    }

    @Override
    public double refuel(int fuel) {
        return 100 - fuel;
    }
}
